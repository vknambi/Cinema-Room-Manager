
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int C = sc.nextInt();

        String result = (A + B > C && A + C > B &&  B + C > A) ? "YES" : "NO";


        System.out.println(result);
    }
}