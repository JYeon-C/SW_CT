package D2;

import java.util.Scanner;

class D2_1979
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int M = sc.nextInt();
            int K = sc.nextInt();
            int[][] A = new int[M][M];
            int cnt = 0, result=0;

            for(int i=0; i<M; i++){
                for(int j=0; j<M; j++){
                    A[i][j] = sc.nextInt();
                }
            }
            // 가로 체크
            for(int i=0; i<M; i++){
                for(int j=0; j<M; j++){
                    if(A[i][j] == 1) cnt++;
                    else cnt=0;
                    if(cnt == K) result++;
                    if(cnt == K+1) result--;
                }
                cnt=0;
            }

            //세로체크
            for(int i=0; i<M; i++){
                for(int j=0; j<M; j++){
                    if(A[j][i] == 1) cnt++;
                    else cnt=0;
                    if(cnt == K) result++;
                    if(cnt == K+1) result--;
                }
                cnt=0;
            }

            System.out.print("#" + (t+1) + " " + result + "\n");
        }
        sc.close();
    }
}