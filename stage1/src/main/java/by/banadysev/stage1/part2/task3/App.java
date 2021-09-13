package by.banadysev.stage1.part2.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Let's check");
        System.out.print("Enter x1 = : ");
        int x1 = in.nextInt();
        System.out.print("Enter y1= : ");
        int y1 = in.nextInt();
        System.out.print("Enter x2 = : ");
        int x2 = in.nextInt();
        System.out.print("Enter y2= : ");
        int y2 = in.nextInt();
        System.out.print("Enter x3 = : ");
        int x3 = in.nextInt();
        System.out.print("Enter y3= : ");
        int y3 = in.nextInt();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println("Points lie on one straight line");
        else
            System.out.println("Points do not lie on one straight line");
    }
}