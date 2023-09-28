import java.util.Scanner;
    public class SalaryStudentID {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int numAttendance, numAbsence, totalSalary;
        int salary=40000, salaryDeducation=2500;
        System.out.println("Input Attendance Number: ");
        numAttendance = input.nextInt();
        System.out.println("Input absence Number: ");
        numAbsence  = input.nextInt();
        totalSalary=(numAttendance*salary)-(numAbsence*salaryDeducation);
        System.out.println("totalSalary: "+totalSalary);
    }

}
