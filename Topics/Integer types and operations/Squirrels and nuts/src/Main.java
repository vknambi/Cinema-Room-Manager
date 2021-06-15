import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int input1 = scanner.nextInt();

        int input2 = scanner.nextInt();

        int final_output = input2 % input1;

        System.out.println(final_output);
    }
}