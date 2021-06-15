import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0, i;

        int[] number = new int[input];

        for ( i = 0; i < input; i++ ) {

            number[i] = sc.nextInt();
        }

        for ( i = 0; i < input; i++) {

            if(number[i] % 6 == 0) {
                sum = sum + number[i];
            }
        }

        System.out.println(sum);

    }
}