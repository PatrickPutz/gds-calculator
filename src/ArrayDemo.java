public class ArrayDemo {
    public static void main(String[] args) {

        double[] articles = new double[5];
        articles[0] = 2.4; // 1. Element
        articles[1] = 2.0; // 2. Element
        articles[2] = 2.9; // 3. Element

        // double sum = articles[0] + articles[1] + articles[2] + articles[3] + articles[4];
        double sum = 0;
        for(int i = 0; i < articles.length; i++){
            sum = sum + articles[i];
        }
        System.out.println("Gesamtkosten: " + sum);

        int[] ArrayOne = new int [3];
        ArrayOne[0] = 3;
        ArrayOne[1] = 4;
        ArrayOne[2] = 5;

        int[] ArrayTwo = new int [3];
        ArrayTwo[0] = 7;
        ArrayTwo[1] = 1;
        ArrayTwo[2] = 3;

        for(int i = 0; i < ArrayOne.length; i++){
            System.out.println(ArrayOne[i] + " + " + ArrayTwo[i] + " = " + (ArrayOne[i] + ArrayTwo[i]));
        }
        for(int i = 0; i < ArrayOne.length; i++){
            System.out.println(ArrayOne[i] + " - " + ArrayTwo[i] + " = " + (ArrayOne[i] - ArrayTwo[i]));
        }
        for(int i = 0; i < ArrayOne.length; i++){
            System.out.println(ArrayOne[i] + " * " + ArrayTwo[i] + " = " + (ArrayOne[i] * ArrayTwo[i]));
        }
        for(int i = 0; i < ArrayOne.length; i++){
            System.out.println(ArrayOne[i] + " / " + ArrayTwo[i] + " = " + (ArrayOne[i] / ArrayTwo[i]));
        }
        for(int i = 0; i < ArrayOne.length; i++){
            System.out.println(ArrayOne[i] + " % " + ArrayTwo[i] + " = " + (ArrayOne[i] % ArrayTwo[i]));
        }

    }
}
