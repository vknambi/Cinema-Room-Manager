
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int[] Number = new int[input];

        for(int i =0 ; i < input ; i++) {
            Number[i] = sc.nextInt();
        }

        System.out.println(lis(Number,input));
    }

    public static int lis(int ar[], int input) {

    int[] ls = new int[input];
    int i , j, max = 0;

    for(int k = 0 ; k < input; k++) {

        ls[k]= 1;
    }

    for( i = 1; i < input; i++) {

        for ( j =0 ; j < i; j++) {

            if(ar[i] > ar[j] && ls[i] < ls[j] + 1) {
                ls[i] =ls[j] + 1;
            }
        }
    }

    for(i = 0; i < input ; i++) {

        if(max < ls[i]) {
            max = ls[i];
        }
    }

    return max;

    }
}