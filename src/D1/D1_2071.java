package D1;

import java.util.Scanner;

class D1_2071
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        float sum = 0;
        for(int test_case = 1; test_case <= T; test_case++) {
            for(int j=0; j<10; j++) {
                float n = sc.nextInt();
                sum = sum + n;
            }
            System.out.println("#"+test_case+" "+Math.round(sum/10));
            sum = 0;
        }
    }
}