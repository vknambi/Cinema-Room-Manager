// You can experiment here, it won’t be checked

import java.util.*;

public class Task {
  public static void main(String[] args) {
    // put your code here

    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {

      int input = sc.nextInt();

      if ( input != 0) {

        if (input % 2 == 0) {

          System.out.println("even");
        } else {

          System.out.println("odd");
        }
      } else {
        break;
      }

    }
  }
  }