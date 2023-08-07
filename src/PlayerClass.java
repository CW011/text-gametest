/* This class is used to determine the player's chosen class. This is a very important file as it is the first step
in the player choosing their class which determines their stats, playstyle, etc
 */


import java.util.Scanner;


public class PlayerClass {
    private int selection;
    private String className;
    private Scanner scanner = new Scanner(System.in);


    //takes user class input and applies an actual string to it
    public PlayerClass(){


        System.out.println("Choose your class");
        System.out.println("-----------------");
        System.out.println("1. Mage");
        System.out.println("2. Knight");
        System.out.println("3. Rogue");
        System.out.println("4. Necromancer");

        //while loop that will repeat until the user enters an input that satisfies the conditions of returnClass()
        //also catches exception if user enters anything other than a number
        while(true){
            try{
                System.out.print("Choose your class: ");
                this.selection = Integer.valueOf(this.scanner.nextLine());
                if(this.selection > 0 && this.selection <= 4){
                    this.className = returnClass(this.selection);
                    break;
                }else{
                    System.out.println("That is not a class, try again.");
                }
            }catch(NumberFormatException e){
                System.out.println("That isn't a valid option, please try again.");
            }
        }

    }

    //assign a class to the user's number based on which number is chosen
    //Example: User chooses 2, so the user chooses the Knight class
    private String returnClass(int classNum){
        if(classNum == 1){
            return "Mage";
        }else if(classNum == 2){
            return "Knight";
        }else if(classNum == 3){
            return "Rogue";
        }else{
            return "Necromancer";
        }
    }

    //method for getting the user's character class in order to reference other class files for stats
    public String getClassName(){
        return this.className;
    }


}
