
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();

        int[][] Number = new int[ip][ip];


        for (int i = 0; i < Number.length; i++) {
            for (int j = 0; j < Number[i].length; j++) {
                Number[i][j] = Math.abs(j-i);
                System.out.print(Number[i][j] + " ");
            }
            System.out.println();
        }

    }
}