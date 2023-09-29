import java.util.Scanner;
public class Selection212 {
    public static void main(String[] args) {
        Scanner input212 = new Scanner(System.in);
        System.out.print( "Nilai uas    : ");
        float finalExam = input212.nextFloat();
        System.out.print( "Nilai uts    : ");
        float midExam = input212.nextFloat();
        System.out.print( "Nilai kuis   : ");
        float quiz = input212.nextFloat();
        System.out.print( "Nilai tugas  : ");
        float assignment = input212.nextFloat();
        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        /*String message = total < 65 ? "Retake" : "pass";
        System.out.println("Final grade = " + total + " and the decission is " + message);*/
        if(total > 80 && total <= 100){
            System.out.println("Final grade = A");

        }else if (total > 73 && total <= 80 ){
        System.out.println("Final grade = B+");

        }else if (total > 65 && total <= 73 ){
        System.out.println("final grade = B");

        }else if (total > 60 && total <= 65 ){
        System.out.println("final grade = c+");

        }else if (total > 50 && total <= 60 ){
        System.out.println("final grade = c");

        }else if (total > 39 && total <= 50 ){
        System.out.println("final grade = D");

        }else{
        System.out.println("Final grade = E");
        }
        }
    }
