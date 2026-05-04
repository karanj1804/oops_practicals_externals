import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 100 and 200 are:");

        for (int num = 100; num <= 200; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}