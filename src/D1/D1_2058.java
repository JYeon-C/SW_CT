package D1;

import java.util.*;

class D1_2058 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();


        // T = 6789
        int a;
        int b;
        int sum = 0;

        int n = 1000;
        while(T >= 1 && T <= 9999) {
            a = T / n; // t = 6
            sum = sum + a;

            b = T % n; // t = 789
            T = b;

            n = n/10;

            if(T==0) {
                System.out.println(sum);
                break;
            }
        }
    }
}


