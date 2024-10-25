import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance you have traveled in Miles: ");
        double distance = scanner.nextDouble();

        System.out.println("Enter the time elapsed in hours: ");
        double hours = scanner.nextInt();

        System.out.println("Enter the time elapsed in minutes: ");
        double minutes = scanner.nextInt();

        MPHCalculations mphcalculations = new MPHCalculations(distance, hours, minutes);

        double speed = mphcalculations.CalculateMPH();
        System.out.println("The speed is " + Math.round(speed) + "MPH in " + distance + " miles in " + hours + " hour and " +  minutes + " minutes ");
    
    }
}
