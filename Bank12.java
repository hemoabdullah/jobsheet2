import java.util.Scanner;
public class Bank12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int  init_sav_amount, sav_period;
        double final_sav_amount, interest, interest_percent = 0.02;
        System.out.print( "Input your initial savings amount: ");
        init_sav_amount = sc.nextInt();
        System.out.print( "Input your savings period: "); 
        sav_period = sc.nextInt();
        interest = sav_period * interest_percent * init_sav_amount;
        final_sav_amount = interest + init_sav_amount;
        System.out.println("interest: "+interest);
        System.out.println("final savings amount: "+ final_sav_amount);  
      }
        }
