package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            var scanner = new Scanner(System.in);
            final var sourceRadix = scanner.nextInt();
            final var sourceNumber = scanner.next().split("\\.");
            final var targetRadix = scanner.nextInt();

            if (targetRadix < 1 || sourceRadix < 1
                    || targetRadix > 36 || sourceRadix > 36) {
                System.out.println("error");
                return;
            }

            var decimalIntegerNumber = 0L;
            var position = sourceNumber[0].length() - 1;
            for (var digit : sourceNumber[0].toCharArray()) {
                if (position != 0) {
                    decimalIntegerNumber += convertCharacter(digit) * Math.pow(sourceRadix, position);
                } else {
                    decimalIntegerNumber += convertCharacter(digit);
                }
                position--;
            }

            var decimalFractionalNumber = 0D;
            if (sourceNumber.length == 2) {
                position = 1;
                for (var digit : sourceNumber[1].toCharArray()) {
                    decimalFractionalNumber += (double) convertCharacter(digit) / Math.pow(sourceRadix, position);
                    position++;
                }
            }

            if (targetRadix == 1) {
                do {
                    System.out.print(targetRadix);
                    decimalIntegerNumber--;
                } while (decimalIntegerNumber != 0);
            } else {
                System.out.print(Long.toString(decimalIntegerNumber, targetRadix));
            }

            if (decimalFractionalNumber != 0) {
                System.out.print(".");
            } else {
                return;
            }


            var decimalPlaces = 0;
            while (decimalFractionalNumber != 0 && decimalPlaces != 5) {
                decimalFractionalNumber *= targetRadix;
                System.out.print(Character.forDigit((int) decimalFractionalNumber, targetRadix));
                decimalFractionalNumber -= (int) decimalFractionalNumber;
                decimalPlaces++;
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    private static int convertCharacter(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a' + 10;
        }
        return Integer.parseInt(String.valueOf(c));
    }
}