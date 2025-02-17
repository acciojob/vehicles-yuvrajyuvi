package com.driver;
import java.lang.String;
public class Boat implements WaterVehicle {
   public String name;
    private int capacity;
    public Boat(String name , int capacity){
        this.name=name;
        this.capacity=capacity;
    }
    public void setVehicleName(String name){
        this.name=name;
    }
    public String getVehicleName(){
         return name;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getVehicleCapacity(){
        return capacity;
    }
}
