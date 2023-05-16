package D2;

import java.util.Scanner;

public class D2_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int n = 1;
        int n2 = 10;
        int n3 = 100;

        // 1자리 숫자 3,6,9
        if (N >= 10 && N <= 1000) {
            for (int i = 1; i <= N; i++) {
                if ((i / n == 3) || (i / n == 6) || (i / n == 9)) {
                    System.out.print("- ");
                }

                // 10의 자리 숫자 3,6,9
                else if ((i / n2 == 3) || (i / n2 == 6) || (i / n2 == 9)) {
                    int temp = i % n2;
                    System.out.print("-");
                    if ((temp / n == 3) || (temp / n == 6) || (temp / n == 9)) {
                        System.out.print("-");
                    }
                    System.out.print(" ");
                }

                // 100의 자리 숫자 3,6,9
                else if ((i / n3 == 3) || (i / n3 == 6) || (i / n3 == 9)) {
                    System.out.print("-");
                    int temp = i % n3;

                    // 100의 자리에서 10의 자리가 3,6,9가 들어갈 때
                    if ((temp / n2 == 3) || (temp / n2 == 6) || (temp / n2 == 9)) {
                        System.out.print("-");
                        int temp2 = temp % n2;
                        // 100의 자리에서 10의 자리와 1의 자리에 3,6,9 들어갈 때
                        if ((temp2 / n == 3) || (temp2 / n == 6) || (temp2 / n == 9)) {
                            System.out.print("-");
                        }
                    }
                    // 100의 자리에서 1의 자리만 3,6,9가 들어갈 때
                    else {
                        if ((i % n2 == 3) || (i % n2 == 6) || (i % n2 == 9)) {
                            System.out.print("-");
                        }
                    }
                    System.out.print(" ");
                }

                // 100의 자리가 3,6,9가 아니며 10의 자리와 1의 자리에 3,6,9가 있을 때
                else if (((i % n3) / n2 == 3) || ((i % n3) / n2 == 6) || (((i % n3) / n2 == 9))) {
                    System.out.print("-");
                    int temp2 = (i % n3) % n2;
                    // 100의 자리에서 10의 자리와 1의 자리에 3,6,9 들어갈 때
                    if ((temp2 / n == 3) || (temp2 / n == 6) || (temp2 / n == 9)) {
                        System.out.print("-");
                    }
                    System.out.print(" ");

                }

//             100의 자리에서 1의 자리만 3,6,9가 들어갈 때
                else if ((i % n2 == 3) || (i % n2 == 6) || (i % n2 == 9)) {
                    System.out.print("- ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        else {
            System.out.println("10과 1000사이의 숫자를 입력해주세요");
        }
    }
}
