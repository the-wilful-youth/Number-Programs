package Program;
import java.util.Scanner;

public class Beam {
    public int beam(int n){
        if(n==0)
            return 0;
        else
            return (((n%10)*(n%10))+beam(n/10));
    }

    public static void main(String[] args) {
        Beam obj = new Beam();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = obj.beam(n);
        if(m>n)
            System.out.println("Beam");
        else
            System.out.println("not");
    }
}
