package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private int maxSpeed;

    public SportCar(String carModel, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(carModel, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car model: " + getCarModel()
                + ", Car class: " + getCarClass()
                + ", Weight: " + getWeight()
                + ", Driver: " + getDriver()
                + ", Engine: " + getEngine()
                + ", Max speed: " + maxSpeed + " km/h";
    }

}
