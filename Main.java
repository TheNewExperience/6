import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wprowadź liczbę!");

        double result= sqrt(Integer.parseInt(scanner.nextLine()));
        System.out.println("Pierwiastek wynosi: " +result);
    }
}
