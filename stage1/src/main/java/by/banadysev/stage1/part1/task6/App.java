package by.banadysev.stage1.part1.task6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isExecuted = true;
        Scanner in = new Scanner(System.in);
        LocationValidator calculator = new LocationValidator();


        while (isExecuted) {

            try {
                System.out.println("Let's check");
                System.out.print("Enter value x= : ");
                double x = in.nextDouble();
                System.out.print("Enter value y= : ");
                double y = in.nextDouble();

                boolean value = calculator.validate(x, y);
                System.out.println("Точка принодлежит= " + value);

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