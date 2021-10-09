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

        addAndPrint(a, b);
        subtractAndPrint(a, b);
        multiplicateAndPrint(a, b);
        divideAndPrint(a, b);
        moduloAndPrint(a, b);
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
        if (b == 0){
            return 0;
        } else{
        return a / b;
        }
    }
    public static int modulo(int a, int b){
        if(b == 0){
            return 0;
        }
        else {
            return a % b;
        }
    }

    public static void addAndPrint(int a, int b){

        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void subtractAndPrint(int a, int b){

        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public static void multiplicateAndPrint(int a, int b){

        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public static void divideAndPrint(int a, int b){
        if (b == 0){
            System.out.println("Dividing by 0 does not work.");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
    public static void moduloAndPrint(int a, int b){
        if (b == 0){
            System.out.println("Dividing by 0 does not work.");
        } else {
            System.out.println(a + " % " + b + " = " + (a % b));
        }
    }
}
