import java.util.*;



class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        int columns = sc.nextInt();

        int[][] num = new int[rows][columns];

        for(int i =0 ; i < num.length; i++) {
            for(int j = 0 ; j < num[i].length ; j++) {

                num[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }

    for(int j = 0 ; j < columns ; j++) {
        for(int i = rows - 1; i >=0 ; i--) {

            System.out.print(num[i][j] + " ");
        }

        System.out.println();
    }



    }
}