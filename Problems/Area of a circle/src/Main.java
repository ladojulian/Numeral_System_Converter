import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var radius = scanner.nextDouble();

        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}