package D1;

import java.util.Scanner;

public class D1_2047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.next();

        if (T.length() > 0 && T.length() < 80) {
            System.out.println(T.toUpperCase());

        }
        else {
            System.out.println("80byte 이하로 입력해주세요.");
        }
    }
}
