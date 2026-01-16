package objectorientedprogramming.inheritance;

class Animal{
    protected String name;
    protected int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animals make Sound");
    }

    public void displayAnimal(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Dog extends Animal{
    Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " says: WOOF WOOF!!");
    }
}

class Cat extends Animal{
    Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " says: MEOW MEOW!!");
    }
}

class Bird extends Animal{
    Bird(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " says: TWEET TWEET!!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args){
        Animal dog = new Dog("Scooby", 12);
        Animal cat = new Cat("Kitty", 9);
        Animal bird = new Bird("Jack", 4);

        dog.displayAnimal();
        dog.makeSound();

        cat.displayAnimal();
        cat.makeSound();

        bird.displayAnimal();
        bird.makeSound();
    }
}
