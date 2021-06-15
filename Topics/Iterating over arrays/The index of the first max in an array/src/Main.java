

import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();
        int[] numbers = new int[ip];

        int max = numbers[0];
        int index = 0;


        for(int i =0; i < ip; i++) {

            numbers[i] = sc.nextInt();
        }

        for(int i =0; i < ip; i++) {

            if(max < numbers[i]) {

                max = numbers[i];
                index = i;

            }
        }

        System.out.print(index);

    }
}