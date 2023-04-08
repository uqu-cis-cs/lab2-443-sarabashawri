package edu.uqu.cs;

import java.util.Scanner;

public class Home{
	public static void main(String [] args){

		
Garage sGarage = new Garage();

	        
      sGarage.addCar("Toyota Corolla Cross");
                
  System.out.println("All cars in the garage are:");
        sGarage.listCars();
               
   sGarage.addCar("Ford Fusion");
 	       
 System.out.println("All cars in the garage are:");
        sGarage.listCars();

              
   sGarage.moveOut("Ford Fusion");

              
   System.out.println("\nAll cars in the garage are:");
        sGarage.listCars();
        }

}