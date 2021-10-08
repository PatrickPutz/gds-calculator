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

        int iA = 3;
        int iR = iA++;
        System.out.println("iR = " + iR);
        System.out.println("iA = " + iA);

        String stringOne = "Alpha";
        String stringTwo = "Alpha";
        System.out.println(stringOne.equals(stringTwo));

        boolean bBool = !(2 == 2 || 3 == 4);
        System.out.println(bBool);

        printResult(2 + 3);
        int wub = 2 + 4;
        printResult(wub);



        int result = add(5,25);
        printResult(result);
    }

    public static void printResult(int result){
        System.out.println(result);
    }

    public static int add(int a, int b){
        return a + b;
    }
}
