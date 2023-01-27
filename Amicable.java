package Program;

import java.util.Scanner;

public class Amicable {
    public static void main(String[] args) {
        Amicable obj = new Amicable();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = obj.divisor(num1);
        int sum2 = obj.divisor(num2);
        if (sum1 == num2 && sum2 == num1)
            System.out.println("Amicable");
        else
            System.out.println("Not Amicable");
    }

    public int divisor(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
