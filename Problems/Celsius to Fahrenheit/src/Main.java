import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var temperature = scanner.nextDouble();

        System.out.println(temperature * 1.8 + 32);
    }
}