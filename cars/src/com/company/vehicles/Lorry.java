package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{

    private int loadCapacity;

    public Lorry(String carModel, String carClass, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(carModel, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Car model: " + getCarModel()
                + ", Car class: " + getCarClass()
                + ", Weight: " + getWeight()
                + ", Driver: " + getDriver()
                + ", Engine: " + getEngine()
                + ", Load capacity: " + loadCapacity + " kg";
    }

}
