package by.banadysev.stage1.part3.task8;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Введите число a: ");
      int a = readInt(sc);
      int[] arr = new int[10];

      while(a !=0)
        {
          arr[a % 10]++;
          a /= 10;
        }
      System.out.print("Введите число b: ");
      int b = readInt(sc);
      System.out.print("Общие числа: ");
      while(b !=0) {
          if (arr[b % 10] != 0) {
            System.out.print(b % 10);
          }
          b /= 10;
        }
      }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static int readInt (Scanner scanner) {
    if (scanner.hasNextInt()) {
      return scanner.nextInt();
    } else {
      throw new IllegalArgumentException("Не число");

    }
  }
}


