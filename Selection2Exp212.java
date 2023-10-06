import java.util.Scanner;
public class Selection2Exp212 {
    public static void main(String[] args) {
        int angel1,angle2,angle3;
        int totalAngle;
        Scanner input12 = new Scanner(System.in);
        System.out.print("Please enter angle1: ");
        angel1 = input12.nextInt();
        System.out.print("Please enter angle2: ");
        angle2  = input12.nextInt();
        System.out.print("Please enter angle3: ");
        angle3  = input12.nextInt();

        totalAngle = angel1 + angle2 + angle3;

        if(totalAngle == 180)
        if(angel1==90 || angle2==90 || angle3==90)
            System.out.println("Right triangle");
        else
            System.out.println("Not a right triangle");
    else
        System.out.println("Not a triangle");
    }
}

