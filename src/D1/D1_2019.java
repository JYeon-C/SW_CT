package D1;

import java.util.Scanner;

public class D1_2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        int n=1;
        if(T<=30) {
        for(int i=0; i<=T; i++ ) {
            System.out.print(n + " ");
            n = n * 2;
            }
        }
        else {
            System.out.println("30 이하의 수를 입력해주세요");
        }
    }
}
