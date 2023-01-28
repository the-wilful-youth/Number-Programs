package Program;

import java.util.Scanner;

public class Dudeney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sum(n);
        if(n==a*a*a)
            System.out.println("Dudeney");
        else
            System.out.println("Not Dudeney");

    }
    public static int sum(int n ){
        if(n==0)
            return 0;
        else
            return n%10+sum(n/10);
    }
}
