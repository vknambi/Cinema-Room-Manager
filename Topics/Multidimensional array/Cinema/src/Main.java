

import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] newArray = new int[n][m];

        for(int i = 0; i < newArray.length; i++ ) {

            for(int j = 0; j < newArray[i].length; j++) {

                newArray[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

    }
}