import java.util.Scanner;
public class Selection312 {
    public static void main(String[] args) {
        Scanner input312 = new Scanner(System.in);
        double operand1 ,operand2, result;
        char operator;
        System.out.print("Input operand 1: ");
        operand1 = input312.nextDouble();
        System.out.print("Input operand 2: ");
        operand2 = input312.nextDouble();
        System.out.print("Input operator (+ - * /): ");
        operator = input312.next().charAt(0);
        switch (operator) {
    case '+':
        result = operand1 + operand2; 
        System.out.println(operand1 + + operand2 + + result);
    case '-':
        result = operand1 - operand2;
        System.out.println(operand1 + + operand2 + + result);
    case '*':
        result = operand1 * operand2;
        System.out.println(operand1 + " * " + operand2 + "=" + result);
    case '/':
        result = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + + result);
}
    }
}
