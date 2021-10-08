import java.util.Scanner;

public class ArithmetischeOperationenMethoden {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner getData = new Scanner(System.in);

        System.out.print("Declare variable a: ");
        a = getData.nextInt();
        System.out.print("Declare variable b: ");
        b = getData.nextInt();

        printResult(addition(a, b));
        printResult(subtraction(a, b));
        printResult(multiplication(a, b));
        printResult(division(a, b));
        printResult(modulo(a, b));


    }

    public static void printResult(int result){
        System.out.println(result);
    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }
    public static int modulo(int a, int b){
        return a % b;
    }

    public static void AddAndPrint(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void SubtractAndPrint(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public static void MultiplicateAndPrint(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public static void DivideAndPrint(int a, int b){
        System.out.println(a + " / " + b + " = " + (a / b));
    }
    public static void ModuloAndPrint(int a, int b){
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
