package D1;

import java.util.Scanner;

public class D1_2029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for(int test_case=1; test_case<=T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a!=0 && b!=0) {
                System.out.print("#" + test_case + " " + (a / b) + " " + (a % b));
                System.out.println();
            }
            else {
                System.out.print("0입력 오류");
            }
        }
    }
}
