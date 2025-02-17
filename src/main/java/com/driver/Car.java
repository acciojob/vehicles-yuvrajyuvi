package com.driver;
import java.lang.String;
public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name,boolean b) {
        super(name);
        this.isManual =b;
    }



    public  void Car( int wheels, int doors, int gears, boolean isManual, int seats) {
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.seats=seats;
    }
    public int getWheels(){return wheels;}
    public int getDoors(){return doors;}
    public int getGears(){return gears;}
    public int getSeats(){return seats;}
    public boolean isManual(){return isManual ;}
    public String getType(){return type;}
    public void changeGear(int newGear){
        setCurrentGear(newGear);

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public  void setCurrentGear(int gear){
        this.currentGear =gear;
    }
    public int getCurrentGear(){
        return currentGear;
    }
}
