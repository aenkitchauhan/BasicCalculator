package com.basic_calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n\n===============================");
            System.out.println("BASIC CALCULATOR !!!");
            System.out.println("===============================");
            System.out.println("Type [EXIT] for exit : \n");

            System.out.println("Enter Value 1");
            String s1 = scanner.nextLine();

            if (s1.equalsIgnoreCase("exit"))
            {
                System.out.println("Program is terminating . .  .");
                System.exit(0);
                System.exit(0);
            }

            System.out.println("Enter Value 2");
            String s2 = scanner.nextLine();

            System.out.println("Which operation do you want to perform\n" +
                    " + , / , * , - ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "+":
                    System.out.printf("The addition of %s1 & %s1 = %f",
                            s1, s2, BasicCalculator.addition(s1, s2));
                    break;
                case "-":
                    System.out.printf("The subtraction of %s1 & %s1 = %f",
                            s1, s2, BasicCalculator.subtraction(s1, s2));
                    break;

                case "/":
                    System.out.printf("The divison of %s1 & %s1 = %f",
                            s1, s2, BasicCalculator.divison(s1, s2));
                    break;

                case "*":
                    System.out.printf("The multiplication of %s1 & %s1 = %f",
                            s1, s2, BasicCalculator.multiplication(s1, s2));
                    break;

                default:
                    System.out.println("Wrong Choice");

            }
        }

    }

}
