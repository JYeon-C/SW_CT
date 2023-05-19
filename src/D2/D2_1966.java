package D2;

import java.util.*;

public class D2_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++ ) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }

            // 0 5 6 8 2
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr.length; j++) {
                    if(arr[i] < arr[j]) { //  3  1
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.print("#" +test_case + " ");
            for(int i=0; i<N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

