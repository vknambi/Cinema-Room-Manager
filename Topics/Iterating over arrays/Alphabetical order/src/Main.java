import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);
        boolean check = true;

        String[] txt = sc.nextLine().split(" ");

        for(int i =0 ; i < txt.length-1 ; i++ ) {

            if(txt[i].compareTo(txt[i+1]) < 0 || txt[i].compareTo(txt[i+1]) == 0) {
                check = true;
            } else {
                check = false;
            }
        }

        System.out.println(check);
    }
}