package by.banadysev.stage1.part2.task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                System.out.println("Let's check");
                System.out.print("Enter hole sizes a = : ");
                int a = in.nextInt();
                System.out.print("Enter hole sizes b= : ");
                int b = in.nextInt();
                System.out.print("Enter side of brick x= : ");
                int x = in.nextInt();
                System.out.print("Enter side of brick y= : ");
                int y = in.nextInt();
                System.out.print("Enter side of brick z= : ");
                int z = in.nextInt();

        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("The brick will go into the hole");
        }
        else {
            System.out.println("The brick will not go into the hole");
        }
}
}
