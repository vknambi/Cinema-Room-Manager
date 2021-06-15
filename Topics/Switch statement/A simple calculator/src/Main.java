import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        Long first = sc.nextLong();

        char op = sc.next().charAt(0);

        Long second = sc.nextLong();

        switch (op) {

            case '+' :

                System.out.println(first + second);
                break;

            case '-' :

                System.out.println(first - second);
                break;

            case '/' :

                if(second != 0) {
                    System.out.println(first / second);
                }else {
                    System.out.println("Division by 0!");
                }
                break;

            case '*' :

                System.out.println(first * second);
                break;


            default :

                System.out.println("Unknown operator");
        }


    }
}