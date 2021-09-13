package by.banadysev.stage1.part3.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isExecuted = true;
        while (isExecuted) {
            try {
        System.out.println("Let's check");
        System.out.print("Enter a = : ");
        int a = in.nextInt();
        System.out.print("Enter b= : ");
        int b = in.nextInt();
        System.out.print("Enter step h = : ");
        double h = in.nextDouble();
        double x = a;
        while (x <= b) {
            if (x>2) {
            System.out.println("value ="+ String.format("%.2f",MathCalculate.EqualsMore(x)));
            }
            else {
            System.out.println("value ="+ String.format("%.2f",MathCalculate.EqualsLess(x)));
            }
            x = x + h;
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
