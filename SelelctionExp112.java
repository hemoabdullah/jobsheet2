import java.util.Scanner;
public class SelelctionExp112 {
    public static void main(String[] args) {
        Scanner input12Scanner = new Scanner(System.in);
        int year;
        Scanner input12 = new Scanner(System.in);
        System.out.println("inter year of leap");
        year = input12.nextInt();
        if (year%4 == 0){
            if(year%100 != 0) {
                System.out.println("Leap year");
            } else  {
                if(year%400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
                
            
        }
            
    } else {
        System.out.println("Not a leap year");
    }
}
}
