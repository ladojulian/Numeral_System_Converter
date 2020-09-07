import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var p = scanner.nextDouble();
        var h = scanner.nextDouble();
        final var g = 9.8;

        System.out.println(p * g * h);
    }
}