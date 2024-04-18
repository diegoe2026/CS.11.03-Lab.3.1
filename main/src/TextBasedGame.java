import java.util.Scanner;

public class TextBasedGame {
    static int weight=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your weight in kilograms");
        weight = scanner.nextInt();

        //Scanner scanner = new Scanner(System.in);
        System.out.println("you wake up in some random room with 2 doors in front of you");
        System.out.println("Which door do you choose? 1 or 2");
        int doorChoice = scanner.nextInt();
        scanner.nextLine();
        if (doorChoice == 1) {
            roomOne();
        } else if (doorChoice == 2) {
            roomTwo();
        } else {
            System.out.println("u died");
        }
    }public static void roomOne() {
        System.out.println("You enter room one, u see table with a keys on it");
        System.out.println("What do you do? take keys or leave");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("take keys")) {
            System.out.println("You take the keys and walk into the next room");
            roomTwo();
        } else if (choice.equals("leave")) {
            System.out.println("u went into the next room");
            roomTwo();
        } else {
            System.out.println("u died");
        }
    }public static void roomTwo() {
        System.out.println("ur in room 2 with another door ahead of u");
        System.out.println("What do you do? (keys / kick door)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("keys")) {
            System.out.println("it doenst open. ");
            roomTwo();
        } else if (choice.equals("kick door") && weight<70) {
            System.out.println("it broke, u won");
            winGame();
        } else {
            System.out.println("u weigh too much, gg's");
        }
    }public static void winGame() {
        System.out.println("u win, good job");
    }
}