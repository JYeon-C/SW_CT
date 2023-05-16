package D2;

import java.util.Scanner;

public class D2_1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        int sum=0;
        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            for(int i=1; i<=N; i++) {
                if (i % 2 == 0) {
                    sum = sum - i;
                }
                else {
                    sum = sum + i;
                }
            }

            System.out.println("#" + test_case + " " + sum);
            sum=0;

        }
    }
}
