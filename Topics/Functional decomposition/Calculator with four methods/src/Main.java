import java.util.Scanner;

class SimpleCalculator {
    // Implement your methods here

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        char input = sc.next().charAt(0);

        long b = sc.nextLong();

        switch(input) {

            case '+':
                sumTwoNumbers( a, b);
                break;


            case '-':
                subtractTwoNumbers(a,b);
                break;


            case '/':

                divideTwoNumbers(a,b);
                break;


            case '*' :

                multiplyTwoNumbers(a,b);
                break;

        }




    }



    public static void subtractTwoNumbers(long a , long b) {

        System.out.println(a - b);

    }


    public static void sumTwoNumbers(long a , long b) {

        System.out.println(a + b);

    }


    public static void divideTwoNumbers(long a, long b) {

        if( b > 0 ) {

            System.out.println(a / b);

        } else {

            System.out.println("Division by 0!");

        }
    }


    public static void multiplyTwoNumbers(long a, long b) {

        System.out.println(a * b);

    }
}
