import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.

        if( x <= 0 ){

            return f1(x);

        }else if ( x > 0 && x < 1) {

          return f2(x);
        }else if( x >= 1){

            return f3(x);
        }else
            return 0.0;
    }

    //implement your methods here
    public static double f1(double x) {

        double result = (Math.pow(x,2)) + 1;

        return result;

    }

    public static double f2(double x) {

        double result_2 = (double) (1 / Math.pow(x,2));

        return result_2;
    }

    public static double f3(double x) {

        double result_3 = (Math.pow(x,2)) - 1;

        return result_3;

    }
}