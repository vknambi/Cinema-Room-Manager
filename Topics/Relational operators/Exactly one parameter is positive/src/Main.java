import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int[] numbers = new int[3];

        int count = 0;
        for (int i=0 ;i<3 ;i++) {

            numbers[i] = scanner.nextInt();
        }

        for (int j = 0; j < 3; j++) {

            if(numbers[j] > 0){
                count++;
            }

        }

        if (count == 1) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }


    }
}