package by.banadysev.stage1.part1.task3;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            boolean isExecuted = true;
            Scanner in = new Scanner(System.in);
            Calc calculator = new Calc();


            while (isExecuted) {

                try {
                    System.out.println("Let's calcutate");
                    System.out.print("Enter value x= : ");
                    double x = in.nextDouble();
                    System.out.print("Enter value y= : ");
                    double y = in.nextDouble();
                    double value = calculator.calculate(x, y);
                    System.out.println("value z = " + value);

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

