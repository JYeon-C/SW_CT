package D2;

import java.util.Scanner;

public class D2_1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();



        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            int temp = N;

            int a = 0; // 2의 지수
            int b = 0; // 3의 지수
            int c = 0; // 5의 지수
            int d = 0; // 7의 지수
            int e = 0; // 11의 지수

            while(temp%2==0) {
                a = a + 1;
                temp = temp / 2;

                if(N<1) {
                    break;
                }
            }
                while (temp%3==0) {
                    b = b + 1;
                    temp = temp/3;

                    if(N<1) {
                        break;
                    }
                }
            while (temp%5==0) {
                c = c + 1;
                temp = temp/5;

                if(N<1) {
                    break;
                }
            }
            while (temp%7==0) {
                d = d + 1;
                temp = temp/7;

                if(N<1) {
                    break;
                }
            }
            while (temp%11==0) {
                e = e + 1;
                temp = temp/11;

                if(N<1) {
                    break;
                }
            }

            System.out.println("#" + test_case + " " + a + " " + b + " " + c+ " "  + d + " " + e);

            }
        }
    }
