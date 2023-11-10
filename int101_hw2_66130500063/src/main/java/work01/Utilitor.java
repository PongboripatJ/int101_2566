package work01;

public class Utilitor {

    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static double testPositive(double value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }


    public static long computeIsbn10(long isbn10) {
        long sum = 0;
        long lastDigit = 0;
        int i = 2;
        while (i < 11) {
            sum += (isbn10 % 10) * i;
            isbn10 /= 10;
            i++;
        }
        sum %= 11;
        lastDigit = 11 - sum;
        return lastDigit;
    }
}
