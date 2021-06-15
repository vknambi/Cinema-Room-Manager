package cinema;
import java.util.*;

public class Cinema {


    public static int purchased_Ticket = 0;
    public static int Current_Income = 0;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");

        int rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row");
        int columns = sc.nextInt();

        char[][] seatingArrangement = new char[rows][columns];

        for (int i = 0; i < seatingArrangement.length; i++) {

            Arrays.fill(seatingArrangement[i], 'S');
        }


        do {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int input = sc.nextInt();

            System.out.println();


            switch (input) {

                case 1:
                    ShowSeat(rows, columns, seatingArrangement);
                    break;

                case 2:
                    BuyTicket(rows, columns, seatingArrangement);
                    break;

                case 3:
                    Statistics(rows,columns);
                    break;

                case 0:
                    return;

            }
        } while (true);
    }

    //---------------______________Method to Show Seating Arrangement ______________________________//
    public static void ShowSeat(int row, int column, char[][] seatArr) {

        System.out.println("Cinema:");

        for (int i = 0; i <= row; i++) {

            for (int j = 0; j <= column; j++) {

                if (i == 0 && j == 0) {

                    System.out.print("  ");
                } else if (i == 0) {

                    System.out.print(j + " ");
                } else if (j == 0) {

                    System.out.print(i + " ");

                } else {

                    System.out.print(seatArr[i - 1][j - 1] + " ");
                }
            }

            System.out.println();
        }


    }

    //________________________________Method to buy Tickets _____________________________________//
    public static void BuyTicket(int rows, int columns, char[][] seatArr) {
        Scanner sc = new Scanner(System.in);

        boolean checkpoint = false;

        do {

            System.out.println("Enter a row number:");

            int r_no = sc.nextInt();

            System.out.println("Enter a seat number in that row:");

            int c_no = sc.nextInt();

            // given input exceeds the existing value or not.
            if (r_no > rows || c_no > columns) {

                System.out.println("Wrong input!\n");
                continue;
            }

            //Check whether already the ticket has been booked or not!

            if (seatArr[r_no - 1][c_no - 1] == 'B') {

                System.out.println("That ticket has already been purchased!\n");

            } else {

                checkpoint = true;

                System.out.print("\nTicket price: ");

                if(rows * columns <= 60) {

                    System.out.println("$10");

                    Current_Income += 10;
                } else if (r_no <= rows / 2 ) {

                    System.out.println("$10");

                    Current_Income += 10;

                } else {

                    System.out.println("$8");

                    Current_Income += 8;
                }

                seatArr[r_no - 1][c_no - 1] = 'B';
                purchased_Ticket += 1;

            }


        } while (!checkpoint);


    }



    //________________________________________>>> Method Statistics <<<____________________________________________//
    public static void Statistics(int rows, int columns) {


        // Number of purchased ticket
        System.out.println("Number of purchased tickets: "+ purchased_Ticket);

        //Percentage
        System.out.printf("Percentage: %.2f%%\n", ((float) 100 / (rows * columns) * purchased_Ticket));

        //Current income
        System.out.println("Current income: $"+ Current_Income);

        //Total Income

        System.out.printf("Total income: $%d\n",Total_Income(rows,columns));

    }



    //____________________________________________>> Method TotalIncome <<______________________________________

    public static int Total_Income(int rows, int columns) {

        if(rows * columns <= 60 ){

            return rows * columns * 10;
        } else {

            int firstHalf = rows / 2 * 10 * columns;
            int secondHalf = 8 * (rows - rows / 2) * columns;
            return firstHalf + secondHalf;

        }

    }


}




