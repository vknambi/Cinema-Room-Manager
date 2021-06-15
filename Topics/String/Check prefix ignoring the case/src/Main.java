
import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String input2 = input.substring(0,1);

        if(input2.equalsIgnoreCase("j")) {
            System.out.println("true");
        } else
            System.out.println("false");

    }
}