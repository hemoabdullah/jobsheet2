//import java.util.Scanner;

import java.util.Scanner;

public class SelectionNew112 {

        public static void main(String[] args) {
                Scanner input12 = new Scanner(System.in);
                System.out.println("Input a namber = ");
                int number = input12.nextInt();
                String equals = number % 2 == 0 ? "Number "+number+" is an even number" : "Number "+number+" is an odd number" ;
                System.out.println(equals);
                
        }


}