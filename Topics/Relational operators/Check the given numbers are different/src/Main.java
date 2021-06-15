import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if(one != two && one != three && two != three){

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}