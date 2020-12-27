package sekcja1_5.zadaniaDoKursu_cz5;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int count = 0;
        double average = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;

                sum += number;
                average = (double) sum / count;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));

        scanner.close();
    }
}
