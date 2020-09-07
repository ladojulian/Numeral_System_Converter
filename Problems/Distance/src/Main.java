import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var distance = scanner.nextDouble();
        var hours = scanner.nextDouble();

        System.out.print(distance / hours);
    }
}