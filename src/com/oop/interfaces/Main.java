package com.oop.interfaces;

interface Mammal {
    void eat();

    void sleep();
}


interface LandMammal extends Mammal {
    void walk();

    void run();

    void crawl();
}


interface WaterMammal extends Mammal {
    void swim();
}


class Lion implements LandMammal {
    @Override
    public void eat() {
        System.out.println("Lion is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping.");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking.");
    }

    @Override
    public void run() {
        System.out.println("Lion is running.");
    }

    @Override
    public void crawl() {
        System.out.println("Lion is crawling.");
    }
}

class HumanBeing implements LandMammal {
    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }

    @Override
    public void walk() {
        System.out.println("Human is walking.");
    }

    @Override
    public void run() {
        System.out.println("Human is running.");
    }

    @Override
    public void crawl() {
        System.out.println("Human is crawling.");
    }
}

// Concrete class implementing WaterMammal interface
class Whale implements WaterMammal {
    @Override
    public void eat() {
        System.out.println("Whale is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Whale is sleeping.");
    }

    @Override
    public void swim() {
        System.out.println("Whale is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        LandMammal lion = new Lion();
        LandMammal human = new HumanBeing();
        WaterMammal whale = new Whale();

        lion.walk();
        lion.run();
        human.crawl();
        whale.swim();
    }
}
