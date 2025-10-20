

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj Liczbę: ");
    int n = scanner.nextInt();

    if (czyArm(n))
        System.out.println(n + " jest arm");
    else
        System.out.println(n + " Nie jest arm");
}
public static int sumaPoteg(int num, int dl){
    if (num == 0) return 0;
    int cyfra = num % 10;
    return (int)Math.pow(cyfra, dl) + sumaPoteg(num / 10, dl);
}
public static boolean czyArm(int n){
    if (n < 0) return false;

    int dl = String.valueOf(n).length();
    int suma = sumaPoteg(n, dl);

    return suma == n;
}