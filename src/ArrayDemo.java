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
    }
}
