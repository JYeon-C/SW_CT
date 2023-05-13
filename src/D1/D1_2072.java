package D1;

import java.util.Scanner;

public class D1_2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;


        for(int i = 1; i <= T; i++){
            for(int j = 0; j<10; j++) {
                int tc = sc.nextInt();
                if(tc%2 == 0){
                    continue;
                }
                else {
                    sum = sum + tc;
                }
            }
            System.out.println("#"+i+" " + sum);
            sum = 0;

        }
    }
}