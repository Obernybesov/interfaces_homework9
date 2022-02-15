package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car implements ICar {

    private String carModel;
    private String carClass;
    private String weight;
    private Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, String weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("Start ride");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right");
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public String getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car model: " + carModel
                + ", Car class: " + carClass
                + ", Weight: " + weight
                + ", Driver: " + driver
                + ", Engine: " + engine;
    }



}
