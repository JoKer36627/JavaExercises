import java.util.Scanner;

    void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę: ");
    int n = scanner.nextInt();

    System.out.println("Suma cyfr: " + sumaCyfr(n));



    }

    public static int sumaCyfr(int n){
        if (n == 0) return 0;
        else return (n % 10) + sumaCyfr(n / 10);
    }
