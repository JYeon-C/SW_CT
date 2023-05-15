package D1;

import java.util.Scanner;

public class D1_2046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        if(T>0 && T<100000) {
            for (int i = 0; i < T; i++) {
                System.out.print("#");
            }
        }
        else {
            System.out.println("0<T<100000 사이의 수를 입력해주세요");
        }
    }
}
