import java.util.Scanner;


public class PlayerCharacter {
    private String charName;
    private PlayerClass charClass;

    private Scanner scanner = new Scanner(System.in);


    public PlayerCharacter(){
        System.out.print("What is your name? \nName:");
        this.charName = this.scanner.nextLine();
        this.charClass = new PlayerClass();
    }

    public String getName(){
        return this.charName;
    }

    public String getCharClass(){
        return this.charClass.getClassName();
    }


}
