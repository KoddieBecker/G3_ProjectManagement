package sample;

import java.util.Random;

public class Worker {

    public int ability;
    public WorkerType;

    public Worker(int ability){
        this.ability = ability;

        Random randomAbility = new Random();

        int resultAbility;

        resultAbility = randomAbility.nextInt(5) + 1;
    }

    public String workers;
    public double hours;
    public double points;



    public Worker(String workers, double hours, int points) {
        this.workers = workers;
        this.hours = hours;
        this.points = points;


    }

    @Override
    public String toString() {
        return super.toString();
    }
}


