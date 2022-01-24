package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

      while(true) {
          System.out.println("Enter a number");
          int num = scan.nextInt();

          if (num % 2 == 0) {
              System.out.println("even");
          } else {
              System.out.println("odd");
          }
          System.out.println("another one?");
          String a = scan.next();


          if(a.equals("no")){
              break;
          }

      }
    }
}
