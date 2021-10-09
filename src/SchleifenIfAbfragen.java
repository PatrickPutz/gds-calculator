import java.util.Scanner;

public class SchleifenIfAbfragen {
    public static void main(String[] args) {

        int input = 0;
        Scanner getData = new Scanner(System.in);

        System.out.print("Enter a value: ");
        input = getData.nextInt();

        while (input > 0){
            if (input % 2 == 0){
                System.out.println(input);
                input--;
                input--;
            }
            else {
                input--;
            }
        }
        if(input <= 0){
            System.out.println("Value needs to be greater than 0.");
        }


        int counter = 0;
        System.out.print("Enter a new value: ");
        input = getData.nextInt();

        while(counter <= input){
            if((counter > 0) && (counter % 2 == 0)){
                System.out.print(counter + ", ");
            }
            counter++;
        }
        if(input <= 0){
            System.out.println("Value needs to be greater than 0.");
        }


        /*
        int whileCount = 0;
        while(whileCount < 4){
            System.out.println("I'm in the loop.");
            whileCount++;
        }
        System.out.println("I broke out of the loop.");
        */
    }
}
