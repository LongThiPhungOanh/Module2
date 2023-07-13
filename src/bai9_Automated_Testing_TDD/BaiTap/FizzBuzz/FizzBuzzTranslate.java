package bai9_Automated_Testing_TDD.BaiTap.FizzBuzz;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static void main(String[] args) {
        int number;
        boolean check;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        number = scanner.nextInt();
        check = number > 0 && number < 100;
    } while(!check);{
        boolean check3 = number % 3 == 0;
        boolean check5 = number % 5 == 0;
            if (check3){
                System.out.println("Fizz");
            } else if (check5) {
                System.out.println("Buzz");
            } else if (check3 && check5) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(number);
            }
        }
  }
}