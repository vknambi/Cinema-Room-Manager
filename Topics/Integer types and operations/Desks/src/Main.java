import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int class1 = scanner.nextInt();

        int class2 = scanner.nextInt();

        int class3 = scanner.nextInt();

        int Stud_class1 = (class1 % 2) + (class1) / 2;

        int Stud_class2 = (class2 % 2) + (class2) / 2;

        int Stud_class3 = (class3 % 2) + (class3) / 2;

        int result = Stud_class1 + Stud_class2 + Stud_class3;

        System.out.println(result);


    }
}