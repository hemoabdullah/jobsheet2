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
        String message = total < 65 ? "Retake" : "pass";
        System.out.println("Final grade = " + total + " and the decission is " + message);
    }
}
