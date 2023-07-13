package bai9_Automated_Testing_TDD.BaiTap.TamGiac;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void main() {
        int canhA;
        int canhB;
        int canhC;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập cạnh a");
            canhA = scanner.nextInt();
            System.out.println("nhập cạnh b");
            canhB = scanner.nextInt();
            System.out.println("nhập cạnh c");
            canhC = scanner.nextInt();
        } while (canhA == 0);{
            boolean checkAB = canhA == canhB;
            boolean checkAC = canhA == canhC;
            boolean checkBC = canhB == canhC;
            if (!checkAB && !checkAC && !checkBC){
                System.out.println("Đây là tam giác thường");
            } else if ((checkAB && !checkBC) || (checkBC && !checkAB) || (checkAC && !checkAB)){
                System.out.println("Đây là tam giác cân");
            } else if(checkAB && checkAC){
                System.out.println("Đây là tam giác đều");
            } else {
                System.out.println("đây không phaải tam giác");
            }
        }
    }
}