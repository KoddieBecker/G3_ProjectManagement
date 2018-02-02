package sample;

import java.util.Random;

public class Task {

    public int points;

    public Task() {

        Random randomTask = new Random();

        this.points = randomTask.nextInt(100) + 1;
    }

    @Override
    public String toString() {
        return "Worker Ability: " + points;
    }
}
