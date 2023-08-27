package com.oop.inheritance.car;

public class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {
        System.out.println("truck 1" + " " + "car 1");

    }

    public String toString() {
        return "monster" + "  " + super.toString();
    }

    public static void main(String[] args) {
        MonsterTruck monsterTruck = new MonsterTruck();

        monsterTruck.m1();
        monsterTruck.m2();
        System.out.println(monsterTruck);
    }
}

