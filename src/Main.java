import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;

        while(flag){
            System.out.print("Input first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Err! that's not a number! Input first number: ");
                scanner.next();
            }
            double num1 = scanner.nextDouble();
            boolean validOperator;
            char operator;
            double result=0;


        do {
            System.out.print("Input operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            validOperator = operator == '+' || operator == '-' || operator == '*' || operator == '/';
            if (!validOperator) {
                System.out.println("Wrong operator, please try again.");
            }
        } while (!validOperator);


            System.out.print("Input second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Err! that's not a number! Input second number:");
                scanner.next();
            }
            double num2 = scanner.nextDouble();



            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("You can't divide by zero");
                        validOperator=false;
                    }
                    break;
                default:
                    return;
            }
            if (validOperator) {
                System.out.println("Result: " + result);
            }

            scanner.nextLine();

            System.out.println("Press Enter to exit or any other key followed by Enter to perform another calculation.");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                flag = false;
            }
        }
    }
}
