
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0;

        int[] numbers = new int[input];

        for(int i =0; i < input ; i++) {

            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }

        System.out.println(sum);







    }
}