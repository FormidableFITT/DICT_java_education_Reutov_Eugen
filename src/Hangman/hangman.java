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
        for(String i :word) {

        }
        String allGuessCharsStr = "";
        while(true)
        {   System.out.print("Guess the word:");
            System.out.println(getMasked(word, allGuessCharsStr));
            String name = in.nextLine();
            if(word.equals(name) ){
                System.out.println("You survived!");
                break;
            }
            System.out.println("You lost!");
        }

        in.close();

    }
    private static final String getMasked(String secret_word, String all_guessesStrESIfNone)  {
        try  {
            if(all_guessesStrESIfNone.length() == 0)  {
                all_guessesStrESIfNone = " ";   //Any non-letter will suffice
            }
        }  catch(NullPointerException npx)  {
            throw  new NullPointerException("all_guessesStrESIfNone");
        }

        //Mask all not-yet-guessed characters with an underscore.
        secret_word = secret_word.replaceAll("[^" + all_guessesStrESIfNone + "]", "_");

        //Insert a space between every character (trim eliminates the final).
        return  secret_word.replaceAll("(.)", "$1 ").trim();
    }
}

