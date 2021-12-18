package CofeeMachine;
import javax.swing.*;
import java.util.Scanner;

public class CofeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        System.out.printf("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "%d of money\n", water, milk, beans, cups, money);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = userInput.nextLine();
        if (action.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            String choice = userInput.nextLine();
            if (choice.equals("1")) {
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;
            } else if (choice.equals("2")) {
                water -= 350;
                beans -= 20;
                milk -= 75;
                cups -= 1;
                money += 7;
            } else if (choice.equals("3")) {
                water -= 200;
                beans -= 12;
                milk -= 100;
                cups -= 1;
                money += 6;
            }
        } else if (action.equals("fill")) {
            System.out.println("Write how many ml of water you want to add:");
            int waterAdd = Integer.parseInt(userInput.nextLine());
            System.out.println("Write how many ml of milk you want to add:");
            int milkAdd = Integer.parseInt(userInput.nextLine());
            System.out.println("Write how many ml of beans you want to add:");
            int beansAdd = Integer.parseInt(userInput.nextLine());
            System.out.println("Write how many ml of beans you cups to add:");
            int cupsAdd = Integer.parseInt(userInput.nextLine());
            water += waterAdd;
            milk += milkAdd;
            beans += beansAdd;
            cups += cupsAdd;
        } else if (action.equals("take")) {
            System.out.printf("I give you %d money\n", money);
            money = 0;
        }
        System.out.printf("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "%d of money", water, milk, beans, cups, money);
    }
}