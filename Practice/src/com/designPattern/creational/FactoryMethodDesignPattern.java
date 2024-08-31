package com.designPattern.creational;


//Car interface
interface Car {
void assemble();
}

//Concrete Product for Sedan Car
class Sedan implements Car {
public void assemble() {
   System.out.println("Assembling Sedan car.");
}
}

//Concrete Product for Hatchback Car
class Hatchback implements Car {
public void assemble() {
   System.out.println("Assembling Hatchback car.");
}
}

//CarFactory class for creating cars
class CarFactory {
 public static Car createCar(String type) {
     switch (type) {
         case "Sedan":
             return new Sedan();
         case "Hatchback":
             return new Hatchback();
         default:
             throw new IllegalArgumentException("Invalid car type: " + type);
     }
 }
 
//CarSpecification interface
interface CarSpecification {
void display();
}

//Concrete Product for North America Car Specification
class NorthAmericaSpecification implements CarSpecification {
public void display() {
    System.out.println("North America Car Specification: Safety features compliant with local regulations.");
}
}

//Concrete Product for Europe Car Specification
class EuropeSpecification implements CarSpecification {
public void display() {
    System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
}
}

 public static CarSpecification createSpecification(String region) {
     switch (region) {
         case "NorthAmerica":
             return new NorthAmericaSpecification();
         case "Europe":
             return new EuropeSpecification();
         default:
             throw new IllegalArgumentException("Invalid region: " + region);
     }
 }
}

//Client Code
public class FactoryMethodDesignPattern {
 public static void main(String[] args) {
     // Creating cars
     Car sedan = CarFactory.createCar("Sedan");
     Car hatchback = CarFactory.createCar("Hatchback");

     sedan.assemble();
     hatchback.assemble();

     // Creating car specifications
     CarSpecification naSpec = CarFactory.createSpecification("NorthAmerica");
     CarSpecification euSpec = CarFactory.createSpecification("Europe");

     naSpec.display();
     euSpec.display();
 }
}
