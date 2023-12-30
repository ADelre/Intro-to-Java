package Examples.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("You can type \"Print\" to view your current list, or \"Exit\" to close the application.");
        while (!userInput.equals("Exit")) {
            System.out.println("Please enter an item to add to your list.");
            userInput = scanner.nextLine();
            todoList.add(userInput);

            if (userInput.equals("Print")) {
                for (String value:
                     todoList) {
                    System.out.println(value);
                }
            }
        }

        System.out.println("Thank you, goodbye!");
    }
}