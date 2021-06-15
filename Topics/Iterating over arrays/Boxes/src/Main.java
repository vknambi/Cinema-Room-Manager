

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        int[] abc = new int[3];
        int[] xyz = new int[3];

        int counter_1 = 0 , counter_2 = 0;

        for (int i = 0; i < 3; i++) {

            abc[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {

            xyz[i] = sc.nextInt();
        }

        Arrays.sort(abc);

        Arrays.sort(xyz);


        for(int i =0 ; i < 3 ; i++) {

            if(abc[i] < xyz[i]) {

                counter_1++;
            } else if(abc[i] > xyz[i]){
                counter_2++;

            }
        }

        if(counter_1 == 3) {

            System.out.println("Box 1 < Box 2");

        } else if (counter_2 == 3){

            System.out.println("Box 1 > Box 2");
        } else {

            System.out.println("Incompatible");
        }




    }

}