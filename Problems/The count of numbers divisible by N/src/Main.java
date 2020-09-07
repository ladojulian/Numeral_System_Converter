import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var n = scanner.nextInt();

        var extra = a == n || a > n && a % n == 0 ? 1 : 0;

        System.out.println(b / n - a / n + extra);
    }
}