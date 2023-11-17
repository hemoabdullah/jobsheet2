import java.util.Scanner;

public class nestedloop12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            double sum = 0;
            for (int j = 0; j < temps[0].length; j++) {
                sum += temps[i][j];
            }
            double average = sum / temps[0].length;
            System.out.println("Average temperature for Kota ke-" + i + ": " + average);
        }
    }
}

