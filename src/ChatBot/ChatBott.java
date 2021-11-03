package ChatBot;
import java.util.Scanner;

public class ChatBott {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Robert.");
        System.out.println("I was created in 2021.");
        Scanner in = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String name = in.nextLine();

        System.out.printf("What a great name you have, %s \n", name);
        in.close();


    }
}
