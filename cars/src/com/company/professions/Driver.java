package com.company.professions;

public class Driver extends Person{

    private String name;
    private String drivingExperience;

    public Driver(String name, String drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return name
                + ", Driving experience: " + drivingExperience;
    }

}
