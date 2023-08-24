import java.util.Scanner;

public class fibonacci{
    static int i;
    static int j;
    static int z=0;
    static void fibonacci(int n){
        if(i==n){
            return;
        }
        
        z=i+j;
        System.out.println(z);
        i=j;
        j=z;
        
        fibonacci(n--);
    }
    public static void main(String[] args) {
    System.out.println("Enter the value of N:-");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter the first 2 value's");
    i=sc.nextInt();
    j=sc.nextInt();
    System.out.println(i);
    System.out.println(j);
    fibonacci(n);
    }
}