import java.util.Scanner;

public class Calculations {

    public double calcPerm(double length, double width) {
        return 2 * (length + width);
    }

    public double calcSurfarea(double side) {
        return 6 * Math.pow(side, 2);
    }

    public double calcArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printResult(String shape, double result) { 
        System.out.println("The calculation for the " + shape + " is " + result);

    }
}


