// Assignment 37
// Karthik Raghavun
// Dec 19, 2024
// Names that are picked are eliminated from the list until one name remains. The last name standing is the winner.



import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Stuart");
        names.add("Travis");
        names.add("Diana");
        names.add("Fiona");
        names.add("Hannah");
        names.add("Emily");
        names.add("Isaac");
        names.add("Juila");

        ReverseRaffle raffle = new ReverseRaffle(names);
        raffle.displayIntro();
        raffle.startRaffle();
    }
}