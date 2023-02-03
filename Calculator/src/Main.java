public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        printMenu();
        calculator.inputOperand1();
        while (true) {
            calculator.inputOperation();
            calculator.inputOperand2();
            calculator.operand1 = calculator.checkOperation();
            calculator.printResult();
        }
    }
    public static void printMenu() {
        System.out.println("Здравствуйте!\n");
        System.out.println("Для вычисления используйте символы: \"+\", \"-\", \"*\", \"/\"");
        System.out.println("Для обнуления результата введите команду: \"C\"");
        System.out.println("Для выхода из программы введите команду: \"s\"\n");
    }
}