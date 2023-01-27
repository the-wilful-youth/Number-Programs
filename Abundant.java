package Program;

import java.util.Scanner;

public class Abundant {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Abundant obj = new Abundant();
        n = sc.nextInt();
        int sum = obj.check(1);
        if(sum>n)
            System.out.println("Abundant");
        else
            System.out.println("Not Abundant");
    }
    public int check(int i){
        if(i==n)
            return 0;
        else{
            if (n%i==0)
                return i+check(i+1);
            else
                return check(i+1);
        }
    }
}
