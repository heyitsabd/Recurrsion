import java.util.Scanner;

public class sum_n {
        static int i=0;
        static int x=0;
        static int z=0;
    public static void sum(int n){
        if(i==n){
        System.out.println(x);
        return;
        }
        z=z+1;
        x=x+z;
        sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:-");
        int n=sc.nextInt();
        sum(n);
    }
}
