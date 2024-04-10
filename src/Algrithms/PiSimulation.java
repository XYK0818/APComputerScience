package Algrithms;

import java.util.Random;

public class PiSimulation {
    public static void main(String[] args) {

        int iterationNumber = 1000;
        double sum = 0.0;

        for(int i = 0; i < iterationNumber; i++) {
            sum += singleIteration();
        }

        double pi = sum / iterationNumber;

        System.out.println("the simulation result of Pi is: " + pi);
    }

    public static double singleIteration(){
        int totalPoints = 10000;
        int insideCircle = 0;

        for (long i = 0; i < totalPoints; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        double pi = 4.0 * insideCircle / totalPoints;

        return pi;
    }
}
