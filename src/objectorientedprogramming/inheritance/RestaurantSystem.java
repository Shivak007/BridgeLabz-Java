package objectorientedprogramming.inheritance;

interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious foods.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Shiva", 111);
        Waiter waiter = new Waiter("Hrithik", 776);

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}