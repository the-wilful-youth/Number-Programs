package Program;

import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Armstrong obj = new Armstrong();
        int n = sc.nextInt();
        int sum = obj.check(n);
        if(sum==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
    public int check(int n){
        if(n==0)
            return 0;
        else{

            return ((n%10)*(n%10)*(n%10))+check(n/10);
        }
    }
}
