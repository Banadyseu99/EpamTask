package by.banadysev.stage1.part1.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isExecuted = true;
        Scanner in = new Scanner(System.in);
        Function function = new Function();

        while (isExecuted) {

            try {
                System.out.println("Let's calcutate");
                System.out.println("Enter value a= : ");
                double a = in.nextDouble();
                System.out.println("Enter value b= : ");
                double b = in.nextDouble();
                System.out.println("Enter value c= : ");
                double c = in.nextDouble();
                double value = function.calculate(a, b, c);
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
