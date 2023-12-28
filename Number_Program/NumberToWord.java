import java.util.Scanner;

public class NumberToWord {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static String convertLessThanThousand(int number) {
        if (number == 0) {
            return "";
        } else if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + convertLessThanThousand(number % 10);
        } else {
            return units[number / 100] + " Hundred " + convertLessThanThousand(number % 100);
        }
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String result = "";
        if (number < 0) {
            result = "Negative ";
            number = Math.abs(number);
        }

        if (number >= 1000000) {
            result += convertLessThanThousand(number / 1000000) + " Million ";
            number %= 1000000;
        }

        if (number >= 1000) {
            result += convertLessThanThousand(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if (number > 0) {
            result += convertLessThanThousand(number);
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String words = convertNumberToWords(number);
        System.out.println("In words: " + words);

        scanner.close();
    }
}
