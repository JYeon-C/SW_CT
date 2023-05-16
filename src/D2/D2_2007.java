package D2;

import java.util.Scanner;

public class D2_2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();
            for (int j = 1; j <= 10; j++) { // 문자열의 최대 길이 10
                if (str.substring(0, j).equals(str.substring(j, j * 2))) {
                    System.out.println("#" + test_case + " " + j);
                    break;
                }
            }
        }
    }
}


