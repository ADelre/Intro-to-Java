package Examples.demos;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class Question2Advanced {
    public static void main(String[] args) {
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);

        UserInput[] questions = defineQuestions();

        for (int index = 0; index < questions.length; ++index) {
            questions[index].setValue(validateInput(scanner, questions[index].getClazz(), questions[index].getMessage()));
        }

        switch (questions[1].getValue().toString()) {
            case "+":
                result = (Double.parseDouble(questions[0].getValue().toString()) + Double.parseDouble(questions[2].getValue().toString()));
                break;
            case "-":
                result = (Double.parseDouble(questions[0].getValue().toString()) - Double.parseDouble(questions[2].getValue().toString()));
                break;
            case "/":
                result = (Double.parseDouble(questions[0].getValue().toString()) / Double.parseDouble(questions[2].getValue().toString()));
                break;
            case "x":
            case "*":
                result = (Double.parseDouble(questions[0].getValue().toString()) * Double.parseDouble(questions[2].getValue().toString()));
                break;
            default:
                break;
        }

        System.out.println(questions[0].getValue().toString() + " " + questions[1].getValue().toString() + " " + questions[2].getValue().toString() + " = " + result);
    }

    private static UserInput[] defineQuestions() {
        UserInput[] values = new UserInput[3];
        values[0] = new UserInput<>(Double.class, "Please enter a number.");
        values[1] = new UserInput<>(String.class, "Please enter a mathematical operation.");
        values[2] = new UserInput<>(Double.class, "Please enter a second number.");
        return values;
    }

    private static class UserInput<T> {
        private final Class<T> clazz;
        private final String message;
        private T value;

        public UserInput(Class<T> clazz, String message) {
            this.clazz = clazz;
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public Class getClazz() {
            return this.clazz;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "UserInput{" +
                    "clazz=" + clazz +
                    ", message='" + message + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    private static <T> T validateInput(Scanner scanner, Class<T> type, String message) {

        T value = null;
        String input;
        String[] acceptedOperations = new String[]{"+", "-", "/", "*", "x"};

        System.out.println(message);

        while (true) {
            input = scanner.nextLine();

            try {
                if (type == Double.class) {
                    return (T) Double.valueOf(input);
                } else {
                    if (Arrays.stream(acceptedOperations).anyMatch(input::equals)) {
                        return (T) input;
                    }
                    throw new InvalidParameterException();
                }
            } catch (NumberFormatException exception) {
                System.out.println("Incorrect value, please enter a number.");
            } catch (InvalidParameterException exception) {
                System.out.println("Incorrect value, please enter a mathematical operation.");
            }
        }
    }
}