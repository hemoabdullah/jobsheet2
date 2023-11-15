import java.util.Scanner;

public class cinema12idk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int row,column;
        boolean menu = true;
        String[][] audience = new String [4][2];
        while (true) {
            
            System.out.println("MENU");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.println("Input your choice");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1 :
                System.out.println("Enter a name : ");
                name = scan.nextLine();
                System.out.println("Enter a row number : ");
                row = scan.nextInt();
                System.out.println("Enter column number : ");
                column= scan.nextInt();
                scan.nextLine();
        
                if(audience[row - 1][column - 1] == null){
                    audience[row - 1][column - 1] = name;
                System.out.println("Succesfuly booked");
        
                }
                else{
                    System.out.println("The seat is already booked \n choose the other");
                    break;
                }
                System.out.println("Are there any other audiences to be added ? (y/n) : ");
                String next = scan.nextLine();
                case 2 :
                System.out.println("Audience List");
                for (int i = 0;i<audience.length;i++){
                    for (int j = 0 ;j<audience[i].length;j++){
                    if(audience[i][j] == null){
                        System.out.println("****\t");
                    }
                    else{
                        System.out.println(audience[i] [j] + "\t");
                    }
                    }
                    System.out.println();
                }
                break;
        
                case 3:
                System.out.println("THANK YOU");
                System.exit(0);
                break;
    }
}

    }
}
    
