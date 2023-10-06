import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class Selection2Exp312 {
    public static void main(String[] args) {
        String category;
        int income, netSalary;
        double tax = 0;
        Scanner input12 = new Scanner(System.in);
        
        System.out.print("input category = ");
        category = input12.nextLine();
        System.out.print("Input income = ");
        income = input12.nextInt();

        if(category.equalsIgnoreCase("worker")){
            if(income <= 2000000) {
                tax = 0.1;
            }else if(income <= 3000000) {
                tax = 0.15; 
            }else
                tax = 0.2;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = "+netSalary);
        }else if(category.equalsIgnoreCase("businessman")){
            if(income <= 2500000) {
                tax = 0.15;
            }else if(income <= 3500000) {
                tax = 0.2;
            }else
                tax = 0.25;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = " +netSalary);
        }else
            System.out.println("Invalid category!");


    }
}
