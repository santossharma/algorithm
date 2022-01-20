package algo;

public class ConvertIntegerToBinary {

    /* Store the remainder when number n is divided by 2 and update the number n with the value of the quotient
        Repeat step 1 until the number n is greater than zero
        Finally, print the remainders in reverse order

    First, divide 7 by 2: remainder 1, quotient 3
        Second, divide 3 by 2: remainder 1, quotient 1
        Then, divide 1 by 2: remainder 1, quotient 0
        And finally, print the remainders in reverse order since the quotient in the previous step is 0: 111
    */
    public static String convertIntToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertIntToBinary(7));
    }

}
