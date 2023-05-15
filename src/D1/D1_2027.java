package D1;

public class D1_2027 {
    public static void main(String[] args) {
        String [][] ary = new String[5][5];


        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(i==j) {
                    ary[i][j] = "#";
                }
                else {
                    ary[i][j] = "+";
                }
                System.out.print(ary[i][j]);
            }
            System.out.println();
        }
    }
}

