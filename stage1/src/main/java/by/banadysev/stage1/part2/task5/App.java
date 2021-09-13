package by.banadysev.stage1.part2.task5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MathFunction calculator = new MathFunction();
        Scanner in = new Scanner(System.in);
        boolean isExecuted = true;
        while (isExecuted) {
        try {
            System.out.println("Let's calculate");
            System.out.print("Enter x = : ");
            double x = in.nextInt();
            if (x > 2) {
                double value = MathFunction.quadraticEquation(x);
                System.out.println("Value =" + value);
            } else {
                double value = MathFunction.inverseFunction(x);
                System.out.println("Value =" + value);
            }
        } catch (Exception e) {
            System.out.println("Incorrect value");
        }

            System.out.println("For closing program input 'quit':");
            String name = in.next();

            if (name.equalsIgnoreCase("quit")) {
                isExecuted = false;

            }
        }
            in.close();

        }
    }




