package Program;


import java.util.Scanner;

public class Duck {
        public int duck(int n){
            if (n==0)
                return 0;
            else {
                if (n%10== 0)
                    return (1+ duck(n/10));
                else
                    return duck(n/10);
            }
        }

        public static void main(String[] args) {
            Duck obj = new Duck();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = obj.duck(n);
            if (a!=0)
                System.out.println("Duck");
            else
                System.out.println("Not Duck");

        }
    }