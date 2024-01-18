public class ReverseNumberFor {
    public static void main(String[] args) {
        int number = 1234567;
        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
