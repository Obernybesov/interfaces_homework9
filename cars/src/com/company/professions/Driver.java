package com.company.professions;

public class Driver extends Person{

    private String drivingExperience;

    public Driver(String name, String drivingExperience) {
        super(name);
        this.drivingExperience = drivingExperience;
    }


    @Override
    public String toString() {
        return getName() + ", Driving experience: " + drivingExperience;
    }

}
