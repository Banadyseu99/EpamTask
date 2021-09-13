package by.banadysev.stage1.part3.task4;
import java.util.Scanner;

public class App {
    public static void main(String []args ) {
        int  n = 1;
        int   pr = 1;
        while (n <= 200) {
            n = (n*n);
            pr = pr * n;
            n++;
        }
        System.out.println(pr);
    }
}

