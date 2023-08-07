/* Practice java
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome adventurer! Before we continue, what is your story?");

        //create PlayerCharacter file for user
        PlayerCharacter pChar = new PlayerCharacter();

        // test line in order to check if the correct values are being applied and retrieved
        System.out.println("You are " + pChar.getName() + ", and you are a " + pChar.getCharClass());






    }

}