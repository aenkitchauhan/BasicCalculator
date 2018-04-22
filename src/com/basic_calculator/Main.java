package com.basic_calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n\n============================");
            System.out.println("BASIC CALCULATOR !!!");
            System.out.println("============================");
            System.out.println("Type [EXIT] for exit : \n");

            System.out.println("Enter Value 1");

            String string1 = scanner.nextLine();

            if (string1.equalsIgnoreCase("exit"))
            {
                System.out.println("Program is terminating . .  .");
                System.exit(0);
            }

            System.out.println("Enter Value 2");
            String string2 = scanner.nextLine();

            System.out.println("Which operation do you want to perform\n" +
                    " + , / , * , - ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "+":
                    System.out.printf("The addition of %s & %s = %f",
                            string1, string2, BasicCalculator.addition(string1, string2));
                    break;
                case "-":
                    System.out.printf("The subtraction of %s & %s = %f",
                            string1, string2, BasicCalculator.subtraction(string1, string2));
                    break;

                case "/":
                    System.out.printf("The divison of %s & %s = %f",
                            string1, string2, BasicCalculator.divison(string1, string2));
                    break;

                case "*":
                    System.out.printf("The multiplication of %s & %s = %f",
                            string1, string2, BasicCalculator.multiplication(string1, string2));
                    break;

                default:
                    System.out.println("Wrong Choice");

            }
        }

    }

}
