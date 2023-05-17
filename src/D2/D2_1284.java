package D2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class D2_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for(int k=1; k<=T; k++) {
            int P = sc.nextInt(); // A사 -> 1L당 P원 8
            int Q = sc.nextInt();; // B사 -> 기본 요금 Q원 300
            int R = sc.nextInt();; // B사-> 월간 사용량 R이하 사용 시 기본 요금 Q 100
            int S = sc.nextInt();; // B사 -> R초과 사용시 1L당 S원 10
            int W = sc.nextInt();; // 종민이가 한달간 사용하는 수도의 양 250
            // A사의 기본 요금
            int A = P*W; // 2000
            // R 기본 미만시 300
            // 초과시 300 + 1500 Q+(W-R)*S

            // 월간 사용량 R이하 사용 시
            if(W<=R) {
                System.out.println("#" + k + " "+Math.min(A,Q));
            }

            // 월간 사용량 R초과 사용 시
            else{
                int B = Q+(W-R)*S; // 초과했을 때
                System.out.println("#" + k + " "+Math.min(A,B));
            }

        }
    }
}
