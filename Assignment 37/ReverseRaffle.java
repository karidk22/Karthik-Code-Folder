import java.util.ArrayList;
import java.util.Scanner;

// ReverseRaffle Class - Handles the logic of the raffle game
class ReverseRaffle {
    private ArrayList<String> names;

    public ReverseRaffle(ArrayList<String> initialNames) {
        names = initialNames;

    }

    public void displayIntro() {
        System.out.println("Welcome to Reverse Raffle!");
        System.out.println("In this game a name will be picked 9 times until one name remains.");
        System.out.println("Each name that is picked is the loser.");
        System.out.println("The last name standing is the winner.");
    }

    public void startRaffle() {
        Scanner scanner = new Scanner(System.in);
        
        while (names.size() >  1) {
            System.out.println("Press Enter to draw the next name");
            scanner.nextLine();
            removeRandomName();
        }

        System.out.println("\nThe winner is: " + names.get(0) + "!");
    }

    private void removeRandomName() {
        int randomIndex = (int) (Math.random() * names.size());
        String removedName = names.remove(randomIndex);
        System.out.println("Name removed: " + removedName);
    }
}





