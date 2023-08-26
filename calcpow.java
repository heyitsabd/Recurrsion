import java.util.Scanner;

public class calcpow{
    static int i=0;
    static int ans=1;
    static void calc(int n,int p){
        if(i==p){
            System.out.println("Answer is " +ans);
            return;
        }
        ans=ans*n;
        i++;
        calc(n, p);
        
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=sc.nextInt();
        System.out.println("Enter the power:- ");
        int p=sc.nextInt();
        calc(n, p);
    }
}