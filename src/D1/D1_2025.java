package D1;

import java.util.Scanner;

public class D1_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int sum = 0;
        if (T > 0 && T < 10000) {
            for (int i = 1; i <= T; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("10000이하의 숫자를 입력해주세요");
        }
    }
}
