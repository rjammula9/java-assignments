package com.oop.accessmodifiers;

public class abstractClass {
    abstract static class Mammal {
        String name;

        Mammal(String name) {
            this.name = name;
        }

        abstract String speak();
    }

    abstract static class LandMammal extends Mammal {
        LandMammal(String name) {
            super(name);
        }

        abstract String walk();
        abstract String run();
        abstract String crawl();
    }

    abstract static class WaterMammal extends Mammal {
        WaterMammal(String name) {
            super(name);
        }

        abstract String swim();
    }

    static class Lion extends LandMammal {
        Lion(String name) {
            super(name);
        }


        String speak() {
            return "Roar!";
        }


        String walk() {
            return name + " is walking on the savanna.";
        }


        String run() {
            return name + " is running after its prey.";
        }


        String crawl() {
            return name + " is crouching and crawling through the grass.";
        }
    }

    static class HumanBeing extends LandMammal {
        HumanBeing(String name) {
            super(name);
        }


        String speak() {
            return "Hello, how are you?";
        }


        String walk() {
            return name + " is walking down the street.";
        }


        String run() {
            return name + " is jogging in the park.";
        }


        String crawl() {
            return name + " is playfully crawling on the ground.";
        }
    }

    static class Whale extends WaterMammal {
        Whale(String name) {
            super(name);
        }


        String speak() {
            return "Whistle and clicks underwater.";
        }


        String swim() {
            return name + " is gracefully swimming through the ocean.";
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Lion lion = new Lion("Simba");
            HumanBeing human = new HumanBeing("John");
            Whale whale = new Whale("Wally");

            Mammal[] mammals = {lion, human, whale};

            for (Mammal mammal : mammals) {
                System.out.println(mammal.name + ": " + mammal.speak());
                if (mammal instanceof LandMammal) {
                    LandMammal landMammal = (LandMammal) mammal;
                    System.out.println(landMammal.walk());
                    System.out.println(landMammal.run());
                    System.out.println(landMammal.crawl());
                } else if (mammal instanceof WaterMammal) {
                    WaterMammal waterMammal = (WaterMammal) mammal;
                    System.out.println(waterMammal.swim());
                }
                System.out.println();
            }
        }
    }

}
