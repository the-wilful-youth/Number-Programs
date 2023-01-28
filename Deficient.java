package Program;

import java.util.Scanner;

public class Deficient {

    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deficient obj = new Deficient();
        n = sc.nextInt();
        int sum = obj.check(1);
        if(sum<n)
            System.out.println("Deficient");
        else
            System.out.println("Not Deficient");
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
