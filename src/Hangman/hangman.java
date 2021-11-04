package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN\n" +
                "The game will be available soon.");
        Scanner in = new Scanner(System.in);
        while (true)
        {   System.out.print("Guess the word:");
            String name = in.nextLine();
            if(name.equals("java")){
                System.out.println("You survived!");
                break;
            }
            System.out.println("You lost!");
        }

        in.close();

    }
}
