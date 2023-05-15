package D1;

import java.util.Scanner;

public class D1_2043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        if(P>K) {
            for (int i = K; i <= P; i++) {
                count++;
            }
            System.out.println(count);
        }
        else {
            for(int i = K; i >= P; i--) {
                count ++;
            }
            System.out.println(count);
        }
    }
}
