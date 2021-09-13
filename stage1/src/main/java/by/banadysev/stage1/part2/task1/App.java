package by.banadysev.stage1.part2.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isExecuted = true;
        Scanner in = new Scanner(System.in);
        TrangleValidator validator = new TrangleValidator();


        while (isExecuted) {

            try {
                System.out.println("Let's check");
                System.out.print("Enter angle alpha= : ");
                int alpha = in.nextInt();
                System.out.print("Enter angle beta= : ");
                int beta = in.nextInt();
                                if (alpha <= 0 || beta <=0 ) {
                    throw new IllegalStateException("Angle should be more than 0");

                }
                boolean isExist = validator.validateIfExist(alpha, beta);
                System.out.println("Triangle is exist = " +  isExist);
                int gamma = 180 - alpha -beta;
                if (isExist) {
                    System.out.println("Triangle is Rectangular = " +  validator.validateIfRectangular(alpha, beta, gamma));
                }


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
