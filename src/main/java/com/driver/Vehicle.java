package com.driver;
import java.lang.*;
public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String name) {
        this.name = name;

    }
    public void  setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void steer(int direction) {
        setCurrentDirection(direction);
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        this.currentSpeed=speed;
        this.currentDirection =direction;
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop() {

        System.out.println("stop method called - The vehicle is stopped");
    }
    public void setCurrentSpeed(int speed){
        this.currentSpeed=speed;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void setCurrentDirection(int direction){
        this.currentDirection=direction;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }

    }
