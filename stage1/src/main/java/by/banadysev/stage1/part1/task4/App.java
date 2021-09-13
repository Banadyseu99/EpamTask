package by.banadysev.stage1.part1.task4;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
    boolean isExecuted = true;
    Scanner in = new Scanner(System.in);
    Doublexchanger exchanger = new Doublexchanger();
            while (isExecuted) {

        try {
            System.out.println("Let's exchange");
            System.out.print("Enter value x= : ");
            String x = in.next();
            if (x.length() !=7 || x.charAt(3) != '.') {
                throw new IOException("Неверный формат ввденного числа, требуемый формат nnn.ddd");
            }
            double value = exchanger.exchange(new Double(x) );
            System.out.println("value x = " + String.format("%.3f", value));

        }catch (IOException ie){
            System.out.println(ie.getMessage());
        }
        catch (Exception e) {
            System.out.println ("Incorrect value" + e.getMessage());
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
