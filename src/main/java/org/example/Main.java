package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, newSize);
        return newArray;
    }

    public enum Direction {
        HORIZONTAL,
        VERTICAL
    }
    public static void printLine(int length, char symbol, Direction direction) {
        if (length <= 0) {
            System.out.println("Line length must be more then 0.");
            return;
        }

        switch (direction) {
            case HORIZONTAL:
                for (int i = 0; i < length; i++) {
                    System.out.print(symbol);
                }
                System.out.println();
                break;
            case VERTICAL:
                for (int i = 0; i < length; i++) {
                    System.out.println(symbol);
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    public static void sortDescending(int[] array) {
        Arrays.sort(array);
        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTask1");

        System.out.println("\"Your time is limited,\n\t so don’t waste it\n\t\t living someone else’s life\"\n\t\t\t Steve Jobs");

        System.out.println("\nTask2");

        System.out.print("Write number: ");
        double number = scanner.nextDouble();

        System.out.print("Write percentage: ");
        double percentage = scanner.nextDouble();

        double result = (percentage / 100) * number;

        System.out.println(percentage + " % " + number + " = " + result);

        System.out.println("\nTask3");

        System.out.print("Write first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Write second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Write third number: ");
        int thirdNumber = scanner.nextInt();

        int result2 = firstNumber * 100 + secondNumber * 10 + thirdNumber;

        System.out.println("Result: " + result2);

        System.out.println("\nTask4");

        System.out.print("Enter a six-digit number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber >= 100000 && inputNumber <= 999999) {
            int digit1 = inputNumber / 100000;
            int digit2 = (inputNumber / 10000) % 10;
            int digit3 = (inputNumber / 1000) % 10;
            int digit4 = (inputNumber / 100) % 10;
            int digit5 = (inputNumber / 10) % 10;
            int digit6 = inputNumber % 10;

            int rearrangedNumber = digit6 * 100000 + digit5 * 10000 + digit3 * 1000 + digit4 * 100 + digit2 * 10 + digit1;

            System.out.println("Result: " + rearrangedNumber);
        } else {
            System.out.println("You should write a six-digit number.");
        }

        System.out.println("\nTask5");


        System.out.print("Write number of month (1 - 12): ");
        int monthNumber = scanner.nextInt();

        String season = "";

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                System.out.println("Error: number is not in range (1 - 12)");
                break;
        }

        if (!season.isEmpty()) {
            System.out.println("Result: " + season);
        }

        System.out.println("\nTask6");


        System.out.print("Write meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Choose convert:");
        System.out.println("1. Miles");
        System.out.println("2. Inches");
        System.out.println("3. Yards");
        System.out.print("Write number: ");
        int choice = scanner.nextInt();

        double resultTask6 = 0.0;

        switch (choice) {
            case 1:
                resultTask6 = meters * 0.000621371;
                break;
            case 2:
                resultTask6 = meters * 39.3701;
                break;
            case 3:
                resultTask6 = meters * 1.09361;
                break;
            default:
                System.out.println("Chose error");
                break;
        }

        System.out.println("Result: " + resultTask6);


        System.out.println("\nTask7");

        System.out.print("Write first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Write second number: ");
        int number2 = scanner.nextInt();

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        System.out.println("Result:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        System.out.println("\nTask8");


        System.out.print("Write start: ");
        int startTask8 = scanner.nextInt();

        System.out.print("Write end: ");
        int endTask8 = scanner.nextInt();

        for (int i = startTask8; i <= endTask8; i++) {
            for (int j = 1; j <= 10; j++) {
                int resulTask8 = i * j;
                System.out.print(i + " * " + j + " = " + resulTask8 + "\t");
            }
            System.out.println();
        }


        System.out.println("\nTask9");

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        int nCount = 0;
        int pCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < 0) {
                nCount++;
            } else if (array[i] > 0) {
                pCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Count negative: " + nCount);
        System.out.println("Count positive: " + pCount);
        System.out.println("Count zero: " + zeroCount);


        System.out.println("\nTask10");

        int size = 10;

        int[] originalArray = new int[size];

        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(201) - 100;
        }

        int[] evenArray = new int[size];
        int evenCount = 0;

        int[] oddArray = new int[size];
        int oddCount = 0;

        int[] negativeArray = new int[size];
        int negativeCount = 0;

        int[] positiveArray = new int[size];
        int positiveCount = 0;

        for (int i = 0; i < size; i++) {
            int num = originalArray[i];

            if (num % 2 == 0) {
                evenArray[evenCount] = num;
                evenCount++;
            } else {
                oddArray[oddCount] = num;
                oddCount++;
            }

            if (num < 0) {
                negativeArray[negativeCount] = num;
                negativeCount++;
            } else if (num > 0) {
                positiveArray[positiveCount] = num;
                positiveCount++;
            }
        }

        evenArray = resizeArray(evenArray, evenCount);
        oddArray = resizeArray(oddArray, oddCount);
        negativeArray = resizeArray(negativeArray, negativeCount);
        positiveArray = resizeArray(positiveArray, positiveCount);

        System.out.println("Start array: " + Arrays.toString(originalArray));
        System.out.println("Even numbers: " + Arrays.toString(evenArray));
        System.out.println("Odd numbers: " + Arrays.toString(oddArray));
        System.out.println("Negative numbers: " + Arrays.toString(negativeArray));
        System.out.println("Positive numbers: " + Arrays.toString(positiveArray));



        System.out.println("\nTask11");

        printLine(10, 'H', Direction.HORIZONTAL);
        printLine(5, '*', Direction.VERTICAL);



        System.out.println("\nTask12");


        int[] arrayTask12 = new int[size];

        for (int i = 0; i < size; i++) {
            arrayTask12[i] = random.nextInt(201) - 100;
        }

        System.out.println("Start array: " + Arrays.toString(arrayTask12));

        System.out.print("Chose sort (1 - Ascending, 2 - Descending): ");
        int choiceTask12 = scanner.nextInt();

        System.out.print("Result");
        if (choiceTask12 == 1) {
            sortAscending(arrayTask12);
            System.out.println(Arrays.toString(arrayTask12));
        } else if (choiceTask12 == 2) {
            sortDescending(arrayTask12);
            System.out.println(Arrays.toString(arrayTask12));
        } else {
            System.out.println("Chose error");
        }
    }
}