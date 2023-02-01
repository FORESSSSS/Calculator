import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double operand1;
    double operand2;

    char operation = scanner.next().charAt(0);
        double result;

    double inputOperand1(){
        System.out.println("Введите 1 число");
        if(scanner.hasNextDouble()){
            operand1 = scanner.nextDouble();
        }else{
            System.out.println("Ошибка1");
            scanner.next();
            operand1 = inputOperand1();
        }
        return operand1;

    }

}
