import java.util.Scanner;
public class Triangle12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int base, height;
        float area;
        System.out.print( "Input base ");
        base=sc.nextInt();
        System.out.print( "input height: ");
        height = sc.nextInt();
        area = base * height / 2;
        System.out.println("area of the triangle: " + area);
         }
        }
