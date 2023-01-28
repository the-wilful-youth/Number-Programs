package Program;

import java.util.Scanner;

public class Disarium {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disarium obj = new Disarium();
        num = sc.nextInt();
        int c =(""+num).length();
        int m = obj.dis(num,c);
        if(m== num)
            System.out.println("Disarium");
        else
            System.out.println("no");
    }
    public int dis(int num, int n){
        if (n==0)
            return 0;
        else
            return (  (int)Math.pow((num%10),n)+ dis( num/10,n-1));
    }
}
