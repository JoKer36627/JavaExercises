import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double sum = 0.0;

        System.out.println("Enter your number:");

        do {
            number = scanner.nextDouble();
            sum += number;
        } while (number != 0);

        System.out.printf("Sum of numbers: " + sum);



    }
}