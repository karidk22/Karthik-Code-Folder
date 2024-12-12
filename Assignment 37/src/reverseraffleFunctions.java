import java.util.*;
public class reverseraffleFunctions {
    String[] list1 = new String[] {"Joe", "Bob", "George", "Sarah", "Emily", "Mark", "Srinivasan", "Balasubramanium", "Kartikeyan", "Bharat"};

    // Create a function that picks 9 names out of the list 
    public void namePicker() {
        System.out.println("Names: " + Arrays.toString(list1));
        Random r = new Random();
        int names = r.nextInt(list1.length);
        System.out.println("Winner: " + list1[names]);
        System.out.println("Losers: " );
    }
        
        // Code that returns the winner of the draw
}