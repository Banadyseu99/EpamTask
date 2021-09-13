package by.banadysev.stage1.part1.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isExecuted = true;
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (isExecuted) {

            try {
                System.out.println("Let's calcutate");
                System.out.print("Enter value a= : ");
                double a = in.nextDouble();
                System.out.print("Enter value b= : ");
                double b = in.nextDouble();
                System.out.print("Enter value c= : ");
                double c = in.nextDouble();
                double value = calculator.calculate(a, b, c);
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
    /*
    public static void main(String[] args) {
 double a = 7;
 double b = 9;
 double c = 4;
 double z = ((b+ sqrt(pow(b,2) + 4*a*c))/2*a) - pow(a,3)*c + pow(b,-2);
        System.out.println("Ваше число равно " +z);  }*/
    }
}
