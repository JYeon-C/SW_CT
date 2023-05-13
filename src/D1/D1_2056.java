package D1;

import java.util.Scanner;


class D1_2056 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 01234567
        int T = sc.nextInt();



        for(int test_case=1; test_case<=T; test_case++) {
            String list = sc.next();
            String year = list.substring(0,4);
            String month = list.substring(4,6);
            int month_int = Integer.parseInt(list.substring(4,6));

            String day = list.substring(6);
            int day_int = Integer.parseInt(list.substring(6));

            switch (month_int) {
                case 1:

                case 3:

                case 5:

                case 7:

                case 8:

                case 10:

                case 12:
                    if (day_int < 1 || day_int > 31) {
                        System.out.println("#"+ test_case + " " + "-1");
                    } else {
                        System.out.println("#"+ test_case + " " + year + "/" + month + "/" + day);
                    }
                    break;

                case 2:
                    if (day_int < 1 || day_int > 28) {
                        System.out.println("#"+ test_case + " " + "-1");
                    } else {
                        System.out.println("#"+ test_case + " " + year + "/" + month + "/" + day);
                    }
                    break;

                case 4:

                case 6:

                case 9:

                case 11:
                    if (day_int < 1 || day_int > 30) {
                        System.out.println("#"+ test_case + " " + "-1");
                    } else {
                        System.out.println("#"+ test_case + " " + year + "/" + month + "/" + day);
                    }
                    break;

                default:
                    System.out.println("#"+ test_case + " " + "-1");

            }
        }
    }
}


