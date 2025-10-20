public class Main {
    public static void main(String[] args) {
        int n = 1234;

        System.out.println(sum(n));

    }

    public static int sum(int n){
        if (n < 10) return n;
        else
            return (n % 10) + sum(n / 10);
    }
}
