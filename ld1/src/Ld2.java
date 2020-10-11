package src;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ld2 {

  public static void main(String[] args) {
    Scanner inputNumber = new Scanner(System.in);
    System.out.println("Enter a number");

    try {
      int number = inputNumber.nextInt();
      inputNumber.close();
      int res = isPerfect(number);

      printResult(res, number);

    } catch (Exception e) {
      System.out.println("Please input only integer values");
      main(args);
    }

  }

  public static int isPerfect(int num) {
    return IntStream.rangeClosed(2, num / 2).reduce(1, (sum, test) -> num % test == 0 ? sum + test : sum);
  }

  /**
   * Prints out whether input @param number is perfect. If sum of @param divisors
   * is larger than number prints out "Abundant" if less than
   */
  public static void printResult(int number, int divisorSum) {
    if (divisorSum > number) {
      System.out.println("Abundant");
    } else if (divisorSum < number) {
      System.out.println("Deficient");
    } else if (divisorSum == number) {
      System.out.println(number + " is a Perfect Number!");
    }
  }

}
