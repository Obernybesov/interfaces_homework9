package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main  {

    public static void main(String[] args) {
        Driver sedanDriver = new Driver("Alex Bushmakin", "3 years");
        Engine sedanEngine = Engine.V_SHAPED;
        Car renault = new Car("Renault", "Sedan", "1000 kg", sedanDriver, sedanEngine);
        Driver lorryDriver = new Driver("Inokentiy Dalnoboy", "10 years");
        Engine lorryEngine = Engine.W_SHAPED;
        Car manLorry = new Lorry("MAN", "Lorry", "6500 kg", lorryDriver, lorryEngine, "2000 kg");
        Driver formulaDriver = new Driver("Formula Driver", "15 years");
        Engine formulaEngine = Engine.INLINE;
        Car f1Bolid = new SportCar("Ferrari", "F1 bolid", "800 kg", formulaDriver, formulaEngine, "350 km/h");

        System.out.println(renault + "\n");
        System.out.println(manLorry + "\n");
        System.out.println(f1Bolid + "\n");

        System.out.println(sedanDriver + " ride:");
        renault.start();
        renault.turnLeft();
        renault.turnRight();
        renault.stop();
        System.out.println("\n");

        System.out.println(lorryDriver + " ride:");
        manLorry.start();
        manLorry.turnRight();
        manLorry.turnLeft();
        manLorry.stop();
        System.out.println("\n");

        System.out.println(formulaDriver + " ride:");
        f1Bolid.start();
        f1Bolid.stop();


    }

}
