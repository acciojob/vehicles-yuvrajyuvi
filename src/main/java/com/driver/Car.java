package com.driver;
import java.lang.*;
public class Car extends Vehicle {
    private int wheels;
    public String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    public Car(String name, int i, int wheels, int doors, boolean isManual, String racing, int seats){
        super(name);
    }
   /* public Car(String name,boolean isManual) {
        super(name);
        this.isManual =isManual;
    }*/


    public Car( String name,String type,int wheels, int doors, int gears, boolean isManual, int seats) {
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.seats=seats;
        this.type =type;
        this.currentGear=1;
    }
    public String getName(){return name;}
    public String getType(){return type;}
    public int getWheels(){return wheels;}
    public int getDoors(){return doors;}
    public int getGears(){return gears;}
    public int getSeats(){return seats;}
    public int getCurrentgear(){return currentGear;}
    public boolean isManual(){return isManual ;}
    public void setName(String name){this.name=name;}
    public void setType(String type){this.type=type;}
    public void setWheels(int wheels){this.wheels= wheels;}
    public void setDoors(int doors){this.doors = doors;}
    public void setGears(int gears){this.gears=gears;}
    public void setSeats(int seats){this.seats=seats;}
    public void setCurrentgear(int currentGear){this.currentGear=currentGear;}
    public void setManual(boolean m){this.isManual=isManual ;}
    public void changeGear(int newGear){
        setCurrentGear(newGear);

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public  void setCurrentGear(int gear){
        this.currentGear =gear;
    }
}
