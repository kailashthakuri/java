package io.ace.java8practice.defaultstatic;

/**
 * If our class is implementing multiple interfaces with the same default methods
 * There might be the ambiguity . One way to resolve this ambiguity is by overriding that method.
 * and providing own implmentation
 */

//public class Car implements Vehicle, FourWheeler {
//    public void print() {
//        System.out.println("I m Car Vehicle with FourWheeler");
//    }
//}


/**
 * to call the default method of specified parent interface using super.
 */
public class Car implements Vehicle, FourWheeler {
    public void print() {
        Vehicle.super.print();
        Vehicle.blowHorn();
        FourWheeler.super.print();
        System.out.println("I m Car");
    }
}
