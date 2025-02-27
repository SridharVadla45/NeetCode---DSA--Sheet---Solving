package src.mathandgeometry;

public class PowerOfXn {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (x == 1.0) {
            return 1.0;
        }

        long absN = Math.abs((long) n); // Use long to prevent overflow

        double result = 1.0;
        while (absN > 0) {
            if ((absN & 1) == 1) { // Check if the least significant bit is 1
                result *= x;
            }
            x *= x;
            absN >>= 1; // Right shift to process the next bit
        }

        if (n < 0) {
            return 1.0 / result;
        } else {
            return result;
        }
    }
}
