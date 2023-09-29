import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Selection112 {
	public static void main(String[] args){
        Scanner input12 = new Scanner(System.in);
        System.out.println("Input a namber = ");
        int number = input12.nextInt();
        if(number%2 == 0){
            System.out.println(number+" is an even number!");
        }else{
            System.out.println(number+" is an odd number!");
        }
    
    }
}