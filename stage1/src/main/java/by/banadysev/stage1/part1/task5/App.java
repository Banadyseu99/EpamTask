package by.banadysev.stage1.part1.task5;

import java.util.Scanner;

public class App {
            public static void main(String[] args) {
            boolean isExecuted = true;
            Scanner in = new Scanner(System.in);
            Times calculator = new Times();


            while (isExecuted) {

                try {
                    System.out.println("Let's calcutate");
                    System.out.print("Enter time duration (in second)= : ");
                    int duration = in.nextInt();
                    if (duration < 0) {
                        throw new IllegalStateException("Duration should be more than 0");
                    }
                    String formattedDuration =  calculator.formatToString (duration);
                    System.out.println("args = " + formattedDuration);

                } catch (IllegalStateException ste) {
                    System.out.println("Something wrong: " + ste.getMessage());
                } catch (Exception e) {
                    System.out.println("Incorrect input. Try again" );
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

