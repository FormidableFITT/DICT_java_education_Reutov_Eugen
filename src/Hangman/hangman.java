package Hangman;
import java.util.Scanner;
import java.util.Random;

public class hangman {
    static String[] WORDS = {"python", "java", "javascript", "kotlin"};
    public static void main(String[] args) {
        System.out.println("HANGMAN\n" +
                "The game will be available soon.");
        Scanner in = new Scanner(System.in);
        String word = WORDS[new Random().nextInt(WORDS.length)];
        while(true)
        {   System.out.print("Guess the word:");
            String name = in.nextLine();
            if(word.equals(name) ){
                System.out.println("You survived!");
                break;
            }
            System.out.println("You lost!");
        }

        in.close();

    }
}
