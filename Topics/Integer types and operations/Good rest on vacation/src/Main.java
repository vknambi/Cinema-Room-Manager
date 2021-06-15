import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        int duration = scanner.nextInt();
        
        int food = scanner.nextInt();
        
        int flight = scanner.nextInt();
        
        int night = scanner.nextInt();
        
        int Total_Food_cost_day = duration * food;
        
        int cost_of_night = (duration - 1) * night;
        
        int cost_of_flight = flight * 2;
        
        int output = Total_Food_cost_day + cost_of_night + cost_of_flight;
        
        System.out.println(output);
        
        
        
    }
}
