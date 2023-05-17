package D2;

import java.util.*;

public class D2_1288 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet(10);

        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();


            for (int k = 1; k <= T; k++) {
                String N = sc.next();

                int num=1;

                while (true) {
                    int t[] = new int[10];

                    int n = Integer.parseInt(N) * num; // 1295
                    String str = String.valueOf(n);


                    // 입력받은 문자 N을 t[]배열에 넣는다. 1295
                    for (int i = 0; i < str.length(); i++) {
                        t[i] = str.charAt(i) - 48;
                        hashSet.add(t[i]);

                    }

                    if (hashSet.size()==10) {
                        System.out.println("#" + k + " " + str);
                        break;

                    } else {
                        num++;
                    }
                }
                hashSet.clear();

            }
    }

}
