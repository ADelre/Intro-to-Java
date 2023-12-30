package Examples.demos;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        String firstNumber;
        String mathOperation;
        String secondNumber;
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        firstNumber = scanner.nextLine();
        System.out.println("Please enter a mathematical operation");
        mathOperation = scanner.nextLine();
        System.out.println("Please enter a second number");
        secondNumber = scanner.nextLine();

        if (mathOperation.equals("+")) {
            result = (Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber));
        } else if (mathOperation.equals("-")) {
            result = (Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber));
        } else if (mathOperation.equals("/")) {
            result = (Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber));
        } else if ((mathOperation.equals("x")) || (mathOperation.equals("*"))) {
            result = (Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber));
        }

        System.out.println(firstNumber + " " + mathOperation + " " + secondNumber + " = " + result);
    }
}