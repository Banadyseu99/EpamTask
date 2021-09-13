package by.banadysev.stage1.part3.task6;

import java.io.IOException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.print("Введите строку: ");

    try (Scanner sc = new Scanner(System.in)) {
      String str = sc.nextLine();
      if (str == null || str.isEmpty()) {
        System.out.println("Строка пустая!");
      }
      else {
        char[] chars = str.toCharArray();
        for (int i=0; i< chars.length; i++) {
          System.out.println(chars[i] + "=" + CharTransformer.transform(chars[i]));
        }
      }

    } catch (Exception e) {
      e.printStackTrace();

    }
  }
}
