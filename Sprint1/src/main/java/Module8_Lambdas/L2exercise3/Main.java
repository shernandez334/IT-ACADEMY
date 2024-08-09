package Module8_Lambdas.L2exercise3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        MathOperations op = () ->{
            float num1;
            float num2;
            float result = 0f;
            String operator;

            System.out.println("Introduce a number");
            num1 = scanner.nextFloat();
            System.out.println("Introduce another number");
            num2 = scanner.nextFloat();

            System.out.println("Please introduce an operator(+, -, *, /).");
            operator = scanner.next();

            switch (operator){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    result = Float.parseFloat(null);
            }
            return result;
        };
        System.out.println(op.operations());
    }
}
