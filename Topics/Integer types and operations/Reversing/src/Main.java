import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
         int rem , reverse = 0;
        
        int input = scanner.nextInt();
        
        while(input > 0){
        
            rem = input % 10;
            reverse = (reverse * 10) + rem;
            input = input / 10;
              
        }
        System.out.print(reverse);
        
        
    }
}
