public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Мясо", "Улица", "Шпиц");
        Cat cat = new Cat("Корм", "Дом","Басик");
        Horse horse = new Horse("Морковь", "Конюшня",15);
        Veterinar veterinar = new Veterinar("Алексей Петрович", 48);
        dog.Eat();
        cat.Sleep();
        horse.makeNoise();
        veterinar.treatAnimal(cat);
    }
}
class Animal {
    String Food;
    String Location;
    Animal(String Food, String Location){
        this.Food = Food;
        this.Location = Location;
    }
    public void makeNoise(){
        System.out.println("Животное издает звуки");
    }
    public void Eat(){
        System.out.println("Животное ест");
    }
    public void Sleep(){
        System.out.println("Животное спит");
    }
}
class Dog extends Animal {
    String Poroda;
    Dog(String Food, String Location, String Poroda) {
        super(Food, Location);
        this.Poroda = Poroda;
    }

    @Override
    public void Eat() {
        System.out.println("Собака ест " + Food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void Sleep() {
        System.out.println("Собака спит");
    }
}
class Cat extends Animal{
    String Name;
    Cat(String Food, String Location, String Name) {
        super(Food, Location);
        this.Name = Name;
    }
    @Override
    public void Eat() {
        System.out.println("Кот ест" + Food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мурчит");
    }

    @Override
    public void Sleep() {
        System.out.println("Кот спит");
    }
}
class Horse extends Animal {
    int Age;
    Horse(String Food, String Location, int Age) {
        super(Food, Location);
        this.Age = Age;
    }
    @Override
    public void Eat() {
        System.out.println("Лошадь ест" + Food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void Sleep() {
        System.out.println("Лошадь спит");
    }
}
class Veterinar {
    String Name;
    int Age;
    Veterinar(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    void treatAnimal(Animal animal){
        System.out.println( "Кота привели на прием" +" \nОн ест: " + animal.Food+ " \nОн обитает в: " + animal.Location);
    }
}