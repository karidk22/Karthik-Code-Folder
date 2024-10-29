public class App {
    public static void main(String[] args) throws Exception {

        long num = 1;
        while (num > 0) {
            System.out.println(num);
            // num = num - 1; is equivalent to num--;
            num--;
        }

        //game loop or program loop
        boolean game = true; //trigger variable
        while (game) {
            //program code or game code or calculations
            System.out.println("Hello universe");

            //kill switch, play again method
            System.out.println("Do you want to play again?");
            String userinput = "no"; //getting user response

            if (userinput.equals("no") ) {
                game = false; //trigger game to end
            }
            
        }

        //Standard For loop in Java
            //Three Conditions
            //for (Where we start; where we end; stpe size)
        for(int i = 10; i > 0; i--) {
            System.out.println("The number is " + i);

        }

        //Equivilant while
        int x = 10;
        while (x > 0) {
            System.out.println("The number is " + x);
            x--;
            
        }
    }
}
