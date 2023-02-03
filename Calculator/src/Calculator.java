import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double operand1, operand2;
    char operation;

    double inputOperand1() {
        System.out.println("Введите число: ");
        if (scanner.hasNextDouble()) {
            operand1 = scanner.nextDouble();
        } else {
            System.out.println("Ошибка! Пожалуйста, введите число!\n");
            scanner.next();
            operand1 = inputOperand1();
        }
        return operand1;
    }

    double inputOperand2() {
        System.out.println("Введите число: ");
        if (scanner.hasNextDouble()) {
            operand2 = scanner.nextDouble();
        } else {
            System.out.println("Ошибка! Пожалуйста, введите число!\n");
            scanner.next();
            operand2 = inputOperand2();
        }
        return operand2;
    }

    void inputOperation() {
        System.out.println("Введите команду: ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+', '-', '*', '/':
                break;
            case 'C', 'С', 'c', 'с' :
                operand1 = 0.0;
                System.out.println("Результат обнулён!\n");
                inputOperand1();
                inputOperation();
                break;
            case 's', 'S' :
                System.out.println("Программа завершена.");
                System.exit(0);
            default:
                System.out.println("Ошибка! Такой операции нет!");
                System.out.println("Пожалуйста, введите символ: \"+\", \"-\", \"*\", \"/\"\n");
                inputOperation();
                break;
        }
    }

    public double checkOperation() {
        switch (operation) {
            case '+':
                return add();
            case '-':
                return sub();
            case '*':
                return mul();
            default:
                return div();
        }
    }

    double add() {
        return operand1 + operand2;
    }

    double sub() {
        return operand1 - operand2;
    }

    double mul() {
        return operand1 * operand2;
    }

    double div() {
        if (operand2 == 0) {
            System.out.println("Делить на 0 нельзя!\n");
            operand2 = inputOperand2();
        }
        return operand1 / operand2;
    }

    void printResult() {
        System.out.println(operand1 % 1 == 0 ? "Результат: " + operand1 + "\b\b\n" : "Результат: " + operand1 + "\n");
    }
}
