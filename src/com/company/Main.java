package com.company;

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal("The overloaded constructor has run");
        a.setName("Yogi Bear");

        System.out.println("The animal is called " + a.getName());
        System.out.println(a.eat());
        System.out.println(a.sleep());
        System.out.println(a.dowhatanimaldoes());

        Animal b = new Animal();
        b.setName("Smokey the Bear");

        System.out.println("The animal is called " + b.getName());
        System.out.println(b.eat());
        System.out.println(b.sleep());
        System.out.println(b.dowhatanimaldoes());

        Bird c = new Bird();
        System.out.println(c.fly());
        System.out.println(c.dowhatanimaldoes());

        Cat d = new Cat();
        d.setName("Tom the Cat");
        System.out.println("The name of the Cat is: "+ d.getName());
        System.out.println(d.speak());
        System.out.println(d.Bite());

        Unicorn e= new Unicorn();
        System.out.println(e.flies());
        System.out.println(e.Magic());



    }
}