package edu.uqu.cs;

import java.util.Scanner;

public class Car{

   
private String model;
private boolean inOutGarage;

    
public Car() {
        this.model = "";
        this.inOutGarage = false;
    }
    

public String getModel() {
        return model;
    }

   

    public boolean getinOutGarage() {
        return inOutGarage;
    }

    
 public void setModel(String model) {
        this.model = model;
    }
 public void setinOutGarage(boolean inOutGarage) {
    
        this.inOutGarage=inOutGarage;
    }
    
 public void moveCarIn() {
        this.inOutGarage = true;
    }

    public void moveCarOut() {
        this.inOutGarage= false;
    }


}   
    
