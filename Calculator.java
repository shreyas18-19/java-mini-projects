import java.util.Scanner;

class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        try {

            switch(op) {

                case '+':
                    System.out.println("Result: " + (a + b));
                    break;

                case '-':
                    System.out.println("Result: " + (a - b));
                    break;

                case '*':
                    System.out.println("Result: " + (a * b));
                    break;

                case '/':
                    System.out.println("Result: " + (a / b));
                    break;

                default:
                    System.out.println("Invalid operation");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Thank you for using calculator");
        }
    }
}