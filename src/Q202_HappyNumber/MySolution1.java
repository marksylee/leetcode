package Q202_HappyNumber;

/**
 * Created by marklee on 8/12/16.
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for
 * which this process ends in 1 are happy numbers.
 *
 * Example: 19 is a happy number
 *
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * Good job!
 * 3ms, 81.63%
 */
public class MySolution1 {
    public static boolean isHappy(int n) {
        if (n < 10) {
            return n == 1 || n == 7;
        }
        int num = 0;
        while (n != 0) {
            int remainder = n % 10;
            num += Math.pow(remainder, 2);
            n /= 10;
        }
        return isHappy(num);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(9));
    }
}
