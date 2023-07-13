package bai9_Automated_Testing_TDD.BaiTap.TinhNgay;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class NextDayCalculatorTest {
    @Test
    void main() {
        int year;
        int day;
        int month;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập ngày");
            day = scanner.nextInt();
            System.out.println("Nhập tháng");
            month = scanner.nextInt();
            System.out.println("Nhập năm");
            year = scanner.nextInt();
        } while (month == 0);{
            boolean checkday = day < 31 && day > 0;
            boolean checkmonth = month < 12 && month > 0;
            if  (day == 31 && month == 12) {
                year++;
                month = 1;
                day = 1;
                System.out.println("year: " + year + " month: " + month + " day: " + day);
            } else if ( day == 31 && checkmonth) {
                month++;
                System.out.println(" year: " + year + " month: " + month + " day: 1");
            } else if ( checkday && checkmonth) {
                day++;
                System.out.println(" year: " + year + " month: " + month + " day: " + day);
            } else {
                System.out.println("khong co ngay hoac thang nay!");
            }
        }
    }
}