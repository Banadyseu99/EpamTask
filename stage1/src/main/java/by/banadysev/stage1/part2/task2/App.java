package by.banadysev.stage1.part2.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
double min1=0;
        double min2=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Let's check");
        System.out.print("Enter a = : ");
        double a = in.nextDouble();
        System.out.print("Enter b = : ");
        double b = in.nextDouble();
        System.out.print("Enter c = : ");
        double c = in.nextDouble();
        System.out.print("Enter d = : ");
        double d = in.nextDouble();
 if (a<b) {
      min1 = a;}
 else {
        min1 = b;}
 if (c<d) {
            min2 = c;}
 else {
            min2 = d;}

 if  (min1 < min2) {
     System.out.println("Maximum number =" + min2);}
 else {
     System.out.println("Maximum number =" + min1);}

}
}
