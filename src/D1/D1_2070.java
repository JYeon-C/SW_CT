package D1;

import java.util.Scanner;

class D1_2070
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if(n1<n2) {
                System.out.println("#"+test_case+" "+"<");
            }
            else if (n1==n2){
                System.out.println("#"+test_case+" "+"=");

            }
            else
                System.out.println("#"+test_case+" "+">");

        }
    }
}