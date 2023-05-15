package D1;

import java.util.Scanner;

public class D1_2050 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        String T = sc.next();
        if (T.length() > 0 && T.length() < 200) {
        for (int j = 0; j < T.length(); j++) {
            System.out.print(Integer.parseInt(String.valueOf(T.charAt(j) - 64)) + " ");
            }
        }
        else {
            System.out.println("에러");
        }
    }
}
