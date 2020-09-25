package src;

import java.util.Scanner;

public class Ld1 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter a number");

        try {
            int number = inputNumber.nextInt();
            inputNumber.close();
            int divisorSum = calculateDivisorSum(number);
            printResult(number, divisorSum);

        } catch (Exception e) {
            System.out.println("Please input only integer values");
            main(args);
        }

    }

    /**
     * Returns sum of all divisions with reminder - 0
     * 
     * @param number number that user inputs
     * @return @param divisorSum sum of devisors
     */
    public static int calculateDivisorSum(int number) {
        int divisorSum = 0;
        for (int i = 1; i < number; i++) {
            int divisionRemainder = number % i;
            if (divisionRemainder == 0) {
                divisorSum += i;
            }
        }
        return divisorSum;
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
