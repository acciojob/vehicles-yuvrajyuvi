package com.driver;

public class Car extends Vehicle {
    private String name;
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    public Car(){

    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
       this.name = super.getName();
       this.wheels=wheels;
       this.doors=doors;
       this.gears=gears;
       this.isManual=isManual;
       this.type=type;
       this.seats=seats;
        //Hint: Car extends Vehicle
    }
    public int getWheels(){
        return wheels;
    }
    public  int getDoors(){
        return doors;
    }
    public int getGears(){
        return gears;
    }
    public  int getCurrentGear(){
        return currentGear;
    }
    public int getSeats(){
        return seats;
    }
    public String getType(){
        return type;
    }
    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

}
