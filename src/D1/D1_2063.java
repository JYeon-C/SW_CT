package D1;

import java.lang.reflect.Array;
import java.util.*;

class D1_2063 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();


        if (T >= 9 && T <= 199 && T % 2 == 1) {
            int[] temp = new int[T];

            // T = 9
            for (int test_case = 0; test_case < T; test_case++) {
//                for (int test_case = 1; test_case <= T; test_case++) {
                temp[test_case] = sc.nextInt();
//                }
            }
            Arrays.sort(temp);
            System.out.println(temp[T/2]);


        }
    }
}

