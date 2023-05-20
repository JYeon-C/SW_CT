package D2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class D2_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt(); // 파리가 있는 배열
            int M = sc.nextInt(); // 파리채

            int[][] arr = new int[N][N];


            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max=0;

            for(int i=0; i< N-M+1; i++) { // 5-2+1 = 0-4
                for(int j=0; j<N-M+1; j++) {
                    int sum=0;

                    for(int k=0; k<M; k++) { // 2
                        for(int l=0;l<M; l++) { // 2
                            sum+=arr[i+k][j+l]; //
                        }
                    }
                    if(max<sum)
                        max=sum;
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}
