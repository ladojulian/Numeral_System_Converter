import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var a = scanner.nextDouble();
        final var b = scanner.nextDouble();
        final var c = scanner.nextDouble();

        System.out.println((c - b) / a);
    }
}