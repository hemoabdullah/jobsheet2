import java.util.Scanner;
public class cinemawithscanner12 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name;
    int row,column;
    String[][] audience = new String [4][2];
while(true){
    System.out.println("Enter a name : ");
    name = scan.nextLine();
    System.out.println("Enter a row number : ");
    row = scan.nextInt();
    System.out.println("Enter column number : ");
    column= scan.nextInt();
    scan.nextLine();

    audience[row - 1][column - 1] = name;
    System.out.println("Are there any other audiences to be added ? (y/n) : ");
    String next = scan.nextLine();

    if (next.equals("n")){
        break;
    }
}

    }
}