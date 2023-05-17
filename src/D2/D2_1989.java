package D2;

import java.util.*;

public class D2_1989 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();


        for(int k=1; k<=T; k++) {
        String s = sc.next();


        char[] arr = s.toCharArray();
            List<Character> list = new ArrayList<>();
            List<Character> r_list = new ArrayList<>();

            for(char e : arr) {
                list.add(e);
                r_list.add(e);
            }

            Collections.reverse(r_list);

            if(list.equals(r_list)){
                System.out.println("#" + k + " " + "1");
            }
            else {
                System.out.println("#" + k + " " + "0");
            }
        }
    }
}
