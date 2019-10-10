/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg7;

/**
 *
 * @author sandi1713
 */
    class Vehicle {
      protected String brand = "Ford";
      public void honk() {
        System.out.println("Tuut, tuut!");
      }
    }

    class Oop2 extends Vehicle {
      private String modelName = "Mustang";
      public static void main(String[] args) {
        Oop2 myFastCar = new Oop2();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
      }
    }
