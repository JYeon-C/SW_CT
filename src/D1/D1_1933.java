package D1;

import java.util.Scanner;

public class D1_1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        if(N>0 && N<=1000) {
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        else {
            System.out.println("0<N<1001 사이의 정수를 입력해주세요");
        }
    }
}
