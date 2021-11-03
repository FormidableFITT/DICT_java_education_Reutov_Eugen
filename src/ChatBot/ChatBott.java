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
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age1 = in.nextInt();
        int age2 = in.nextInt();
        int age3 = in.nextInt();
        int age = (age1 * 70 + age2 * 21 + age3 * 15) % 105;
        System.out.printf("Your age is %d  that's a good time to start programming! ", age);
        int ageFor = in.nextInt();
        System.out.println("NoW i will prove to you that i can count to any number you want");

        for(int i = 0; i < ageFor + 1; i++) {
            System.out.printf("%d !\n", i);
        }
        System.out.println("Что такое ачкобус ?\n1. ты\n2. я\n3. мы\n4. володя");
        while (true)
        {
            int j = in.nextInt();
            if(j == 4){
                System.out.println("great, you right");
                break;
            }
            System.out.println("Please, try again");
        }

        in.close();
        System.out.println("Goodbye, have a nice day!");

    }
}
