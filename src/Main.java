import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int r,a;
      double pi = 3.14;
      Scanner input = new Scanner(System.in);
      System.out.print("Dairenin yarıçapını giriniz : ");
      r = input.nextInt();
      System.out.print("Dairenin merkez açısını giriniz : ");
      a = input.nextInt();
      double alan = (pi * r * r * a)/360;

      System.out.println("Dairenin alanı : " + alan);

    }
    }
