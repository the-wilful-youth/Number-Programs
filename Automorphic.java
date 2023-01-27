package Program;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Automorphic obj = new Automorphic();
        int n = sc.nextInt();
        int sq = n*n;
        int count = obj.count(n);
        int last  = sq%(int)Math.pow(10,count);
        if(last==n)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
    public int count(int n){
        if (n==0)
            return 0;
        else
            return (1+count(n/10));
    }
}
