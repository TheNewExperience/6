import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args)
    {
        Main c = new Main();
        c.numberToSqrt();

    }

    public void numberToSqrt()
    {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wprowadź liczbę!");
        number= Integer.parseInt(scanner.nextLine());
        double result= sqrt(number);
        System.out.println("Pierwiastek wynosi: " +result);

    }
}
