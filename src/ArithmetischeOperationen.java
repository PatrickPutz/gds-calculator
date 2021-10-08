import java.util.Scanner;

public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner getData = new Scanner(System.in);

        System.out.print("Declare variable a: ");
        a = getData.nextInt();
        System.out.print("Declare variable b: ");
        b = getData.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
