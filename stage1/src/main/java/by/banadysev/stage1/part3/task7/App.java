package by.banadysev.stage1.part3.task7;

import by.banadysev.stage1.part3.task6.CharTransformer;

import java.io.IOException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {


      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Введите число m: ");
        int m = readInt(sc);
        System.out.print("Введите число n: ");
        int n = readInt(sc);

        if (m>0 && n>0) {
          int max = m;
          int min = n;
          if (n > m) {
            max = n;
            min = m;
          }

          for (int i = min; i < max; i++) {
            System.out.print("Число = " + i + " Делители:");
            for (int j = 2; j < i; j++) {
              if (i % j == 0) {
                System.out.print(" ");
                System.out.print(j);
              }
            }
            System.out.println();

          }
        }

    } catch (Exception e) {
      e.printStackTrace();

    }
  }

  private static int readInt(Scanner scanner) {
    if (scanner.hasNextInt()) {
      return scanner.nextInt();
    } else {
      throw new IllegalArgumentException("Не число");
    }
  }
}