package D2;

import java.util.*;

public class D2_1959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            ArrayList<Integer> list1 = new ArrayList<>(N);
            ArrayList<Integer> list2 = new ArrayList<>(M);
            ArrayList<Integer> temp = new ArrayList<>();

            int max;


            for(int i=0; i<N;i++) {
                int n1 = sc.nextInt();
                list1.add(i,n1);
            }

            for(int j=0; j<M;j++) {
                int n2 = sc.nextInt();
                list2.add(j,n2);
            }


            if(N<M){
            for(int i=0;i<M;i++) { // 3
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    sum = sum + list1.get(j) * list2.get(j);
                    if(list1.size()>list2.size()) {
                        break;
                    }
                }
                temp.add(i, sum);


                list2.remove(0);

            }
            max = Collections.max(temp);
            System.out.println("#" + test_case + " " + max);

            }
            else if(M<N) {
                for(int i=0;i<N;i++) { // 3
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum = sum + list1.get(j) * list2.get(j);
                        if(list1.size()<list2.size()) {
                            break;
                        }
                    }
                    temp.add(i, sum);
                    list1.remove(0);

                }
                max = Collections.max(temp);
                System.out.println("#" + test_case + " " + max);

            }

            // 크기가 같을 경우
            else {
                for(int i=0;i<N;i++) { // 3
                    int sum = 0;
                    for (int j = 0; j < N; j++) {
                        sum = sum + list1.get(j) * list2.get(j);
                    }
                    temp.add(i, sum);

                }
                max = Collections.max(temp);
                System.out.println("#" + test_case + " " + max);

            }
        }
    }
}

