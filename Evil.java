package Program;

import java.util.Scanner;

public class Evil {
    public static int count(int n){
        if(n==0)
            return 0;
        else{
            if(n%10==1)
                return 1+count(n/10);
            else
                return count(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = count(n);
        if(a%2==0)
            System.out.println("Evil");
        else
            System.out.println("Not Evil");
    }
}
