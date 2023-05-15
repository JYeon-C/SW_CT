package D1;

import java.util.Scanner;

public class D1_1938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>=1 && b>=1 && a <=9 && b<=9) {
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
        }
        else {
            System.out.println("0<a,b<10 사이의 수를 입력해주세요");
        }
    }
}
