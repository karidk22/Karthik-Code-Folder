// A6 Variable Basics
// Karthik Raghavun
// 19 September 2024
// Calculating how many chicken wings the user can buy with $4.75. 

public class App {
    public static void main(String[] args) throws Exception {
        // Declaring chicken (variable) as a double
        double chicken = 0.75;
        // Declaring user_total (variable) as a double and getting the amount of wings that can be bought
        double user_total = (4.75/chicken);
        // Outputing the amount of chicken wings that can be bought. The double will be rounded to an integer to avoid having half a wing
        System.out.println("Since you have $4.75, you can get " + (int) user_total + " chicken wings.");
    }
}
