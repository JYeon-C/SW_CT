package D1;

import java.util.Scanner;

class D1_2068 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int n;
        int temp = 0;

        for(int test_case = 1; test_case <= T; test_case++) {
            for(int j=0; j<10; j++){
                n = sc.nextInt();
                if(n>temp){
                    temp = n;
                }
            }
            System.out.println("#"+test_case+" "+temp);
            temp = 0;

        }

    }
}