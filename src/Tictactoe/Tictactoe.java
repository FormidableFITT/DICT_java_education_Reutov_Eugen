package Tictactoe;
import java.util.Scanner;

public class Tictactoe {

    Scanner userInput = new Scanner(System.in);
    String field = "";

    public static void main(String[] args) {
        Tictactoe myGame = new Tictactoe();
        myGame.setField();
        myGame.showField();
        System.out.println(myGame.checkGameStatus());
    }

    public int countMatches(String target) {
        String deleteTarget = field.replace (target, "");
        return field.length () - deleteTarget.length ();
    }

    public String checkGameStatus() {
        boolean xWin = false;
        boolean oWin = false;

        if (field.charAt(0) == 'X' && field.charAt(1) == 'X' && field.charAt(2) == 'X' || field.charAt(3) == 'X' &&
                field.charAt(4) == 'X' && field.charAt(5) == 'X' || field.charAt(6) == 'X' && field.charAt(7) == 'X' &&
                field.charAt(8) == 'X' || field.charAt(0) == 'X' && field.charAt(3) == 'X' && field.charAt(6) == 'X' ||
                field.charAt(1) == 'X' && field.charAt(4) == 'X' && field.charAt(7) == 'X' || field.charAt(2) == 'X' &&
                field.charAt(5) == 'X' && field.charAt(8) == 'X' || field.charAt(0) == 'X' && field.charAt(4) == 'X' &&
                field.charAt(8) == 'X' || field.charAt(2) == 'X' && field.charAt(4) == 'X' && field.charAt(6) == 'X') {
            xWin = true;
        }
        if (field.charAt(0) == 'O' && field.charAt(1) == 'O' && field.charAt(2) == 'O' || field.charAt(3) == 'O' &&
                field.charAt(4) == 'O' && field.charAt(5) == 'O' || field.charAt(6) == 'O' && field.charAt(7) == 'O' &&
                field.charAt(8) == 'O' || field.charAt(0) == 'O' && field.charAt(3) == 'O' && field.charAt(6) == 'O' ||
                field.charAt(1) == 'O' && field.charAt(4) == 'O' && field.charAt(7) == 'O' || field.charAt(2) == 'O' &&
                field.charAt(5) == 'O' && field.charAt(8) == 'O' || field.charAt(0) == 'O' && field.charAt(4) == 'O' &&
                field.charAt(8) == 'O' || field.charAt(2) == 'O' && field.charAt(4) == 'O' && field.charAt(6) == 'O') {
            oWin = true;
        }

        if (countMatches("X") - countMatches("O") > 1 || countMatches("O") -
                countMatches("X")> 1) {
            return "Impossible";
        } else if (xWin && oWin) {
            return "Impossible";
        } else if (xWin) {
            return "X is winner!";
        } else if (oWin) {
            return "O is winner!";
        } else if (field.contains("_")) {
            return "Game unfinished";
        } else {
            return "Draw";
        }

    }


    public void setField() {
        System.out.println("Enter cells:");
        String newField = userInput.nextLine();
        field = newField;
    }

    public void showField() {
        System.out.printf("---------\n" +
                "| %s |\n" +
                "| %s |\n" +
                "| %s |\n" +
        "---------", field.substring(0, 3), field.substring(3, 6), field.substring(6, 9));
    }
}