import java.util.Scanner;

public class factorial{
    static int i=0;
    static int x=1;
    static void factorial(int n){
        
        int z=n;
        if(i==z){
        System.out.println(x);
        return;
        }
        i=i+1;
        x=x*i;
        
        factorial(n--);
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
}