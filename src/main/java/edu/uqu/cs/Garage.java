package edu.uqu.cs;

import java.util.Scanner;

public class Garage{

   
private Car[] cars = new Car[3];
    
public static int countCars = 0;
  
 public Garage() {
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }
    }
   

public void addCar(String model) {
        if (countCars == cars.length) {
            System.out.println("Garage is full. Cannot add any more cars.");
        } else {
            boolean carExists = false;
            for (int i = 0; i < countCars; i++) {
                if (cars[i].getModel().equals(model)) {
                    System.out.println("Car " + model + " already exists in the garage.");
                    carExists = true;
                    break;
                }
            }
            if (!carExists) {
                cars[countCars].setModel(model);
                cars[countCars].moveCarIn();
                countCars++;
                //System.out.println("Car " + model + " added to the garage.");
            }
        }
    }
    
   public void moveOut(String model) {
        boolean carExists = false;
        for (int i = 0; i < countCars; i++) {
            if (cars[i].getModel().equals(model)) {
                cars[i].moveCarOut();
                //System.out.println("Car " + model + " moved out of the garage.");
                carExists = true;
                for (int j = i; j < countCars - 1; j++) {
                    cars[j] = cars[j+1];
                }
                countCars--;
                break;
            }
        }
        if (!carExists) {
            System.out.println("Car " + model + " does not exist in the garage.");
        }
    }  


  
   public void moveIn(String model) {
        boolean carExists = false;
        for (int i = 0; i < countCars; i++) {
            if (cars[i].getModel().equals(model)) {
                System.out.println("Car " + model + " is already in the garage.");
                carExists = true;
                break;
            }
        }
        if (!carExists) {
            addCar(model);
        }
    } 

   
 public void listCars() {
        for (int i = 0; i < countCars; i++) {
            System.out.println("Car " + (i+1) + ": " + cars[i].getModel());
        }
    } 


}