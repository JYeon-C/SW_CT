package D1;

import java.util.Scanner;

public class D1_1936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if((A == 1 && B == 3) || (A==2 && B==1)|| (A==3 && B == 2)) {
            System.out.println("A");
        }
        else if((B == 1 && A == 3) || (B==2 && A==1)|| (B==3 && A == 2)) {
            System.out.println("B");
        }
    }
}
