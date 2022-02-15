package com.company.details;

public class Engine implements IEngine{

    private int enginePower;
    private String enginePerformance;


    public Engine(int enginePower, String enginePerformance) {
        this.enginePower = enginePower;
        this.enginePerformance = enginePerformance;
    }


    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return enginePower + " h.p. " + enginePerformance;
    }


    @Override
    public double quarterMileET(int weight, int enginePower) {
        this.enginePower = enginePower;
        return 5.825 * Math.pow(weight/enginePower, 0.3333333);
    }
}
