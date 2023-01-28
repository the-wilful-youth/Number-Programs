package Program;

import java.util.Scanner;

public class Beautiful {
    static int m;
    public static void main(String[] args) {
        Beautiful obj = new Beautiful();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = n%10;
        int a = obj.check(n);
        if(a==m)
            System.out.println("Beautiful");
        else
            System.out.println("not");


    }
    public int check(int n){
        if(n==0)
            return 0;
        else{
            if(n%10==m){
                return (1+check(n/10));
            }
            else{
                return (0+check(n/10));
            }
        }
    }
}
