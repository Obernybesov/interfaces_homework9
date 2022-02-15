package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private String maxSpeed;

    public SportCar(String carModel, String carClass, String weight, Driver driver, Engine engine, String maxSpeed) {
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
                + ", Max speed: " + maxSpeed;
    }

}
