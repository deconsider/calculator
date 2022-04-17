import java.util.Scanner;
 
class Calculator {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат:" + result);
    }
 
    public static double getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        if(scan.hasNextDouble()) {
            return scan.nextDouble();
        } else {
            System.out.println("це не число, переробляй ._.");
            return getNumber();
        }
    }
 
    public static char getOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0;
        if(scan.hasNextInt()) {
            operationNumber = scan.nextInt();
        } else {
            System.out.println("це не число, переробляй ._.");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }
 
    public static double add(double num1, double num2) {
        return num1+num2;
    }
 
    public static double sub(double num1, double num2) {
        return num1-num2;
    }
 
    public static double mul(double num1, double num2) {
        return num1*num2;
    }
 
    public static double div(double num1, double num2) {
        if(num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("знал, что если делить на 0, то все будет плохо? p.s перезапускай все");
            return getNumber();
        }
    }
 
    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}
