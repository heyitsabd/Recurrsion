import java.util.Scanner;

public class rev_num{
    public static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the highest bound of number");
        n=sc.nextInt();
        reverse(n);
    }
    
}