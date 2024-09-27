// Assignment 7
// Karthik Raghavun
// 27 September 2024
// Removing and adding words within a string using: .indexOf(), .length(), and .substring() 


public class App {
    public static void main(String[] args) throws Exception 
    {
        String message1 = "I am very happy!";
        String target1 = "very ";

        String message2 = "That was great - lol.";
        String target2 = "lol";
        
        // Modifying the output to disinclude "very"
        int message1Apos = message1.indexOf(target1);
        int message1Bpos = message1Apos + target1.length();
        String newmessage1 = message1.substring(0, message1Apos)  + message1.substring(message1Bpos);
        System.out.println(newmessage1);
        
        // Removing "lol" and replacing it with "laugh out loud"
        int lolpos = message2.indexOf(target2);
        String newmessage2 = message2.substring(0, lolpos) + "laugh out loud" + message2.substring(lolpos + target2.length());
        System.out.println(newmessage2);
    }
}
