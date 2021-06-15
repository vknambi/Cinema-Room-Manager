import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();

        int[][] newArray = new int[ip][ip];

        for (int i = 0; i < ip ; i++) {
            for( int j = 0 ; j < ip ; j++) {
                newArray[i][j] = sc.nextInt();
            }
        }

     /*   for (int i = 0; i < ip ; i++) {
            for( int j = 0 ; j < ip ; j++) {

                System.out.print(newArray[i][j] + " ");
            }

            System.out.println();
        } */

        //checking whether matrix is symeetric or not.

        boolean sym = true;


        for (int i = 0; i < ip ; i++) {
            for( int j = 0 ; j < ip ; j++) {

                if(newArray[i][j] != newArray[j][i]) {

                    sym = false;
                    break;
                }
            }
        }

        if(sym)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }




    }
}