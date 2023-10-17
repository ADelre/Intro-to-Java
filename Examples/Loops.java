package Examples;

import java.util.Arrays;

public class Loops {

  private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  public static void main(String[] args) {

     forLoopExample();

    // forEachLoopExample();

    // whileLoopExample();

    // doWhileLoopExample();

//    collectionForLoopExample();
  }

  private static void forLoopExample() {
    for (int count = 0; count < numbers.length; ++count) {
      System.out.printf("Index: %d / Value: %d\n", count, numbers[count]);
    }
  }

  private static void forEachLoopExample() {
    // Note: This loops starts at "1", instead of "0".
    for (int count : numbers) {
      System.out.printf("Index: %d / Value: %d\n", count - 1, numbers[count - 1]);
    }
  }

  private static void whileLoopExample() {
    int count = 0;

    while (count < numbers.length) {
      System.out.printf("Index: %d / Value: %d\n", count, numbers[count]);
      count = count + 1;
    }
  }

  private static void doWhileLoopExample() {
    int count = 0;

    do {
      System.out.printf("Index: %d / Value: %d\n", count, numbers[count]);
      count = count + 1;
    } while (count < numbers.length);
  }

  // Requires Java 8 and above
  private static void collectionForLoopExample() {
      // Note: This loops does not keep track of the count.
      Arrays.stream(numbers)
        .forEach(digit -> System.out.printf("Value: %d\n", digit));
  }
}
