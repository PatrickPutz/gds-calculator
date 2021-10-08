public class Calculator {
    public static void main(String[] args) {
        int a = 27;
        System.out.println("a = " + a);
        double b = 17.5;
        System.out.println("b = " + b);
        boolean c = false;
        System.out.println("c = " + c);
        char d = 'Y';
        System.out.println("d = " + d);
        String e = "Bamboozled";
        System.out.println("e = " + e);
        
        // modulo
        boolean even = 2 % 2 == 0;
        System.out.println("even = " + even);

        // addition
        int f = 2 + 3;
        // subtraction
        int g = 5 - 7;
        
        float fOne = 3.0f;
        float fTwo = 2.0f;
        
        float fThree = fOne / fTwo;  // Division von integer werten mit float ergebnis: (a * 1.0) / (b * 1.0)
        System.out.println("fThree = " + fThree);
    }
}
