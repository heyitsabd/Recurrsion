import java.util.Scanner;

public class tower_of_hanoi{
    static void toi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer"+n+"from"+src+"to"+dest);
            return;
        }
            toi(n-1, src, dest, helper);
            System.out.println("Transfer"+n+"from"+src+"to"+dest);
            toi(n-1,helper,src,dest);
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toi(n, "S" , "H" , "D");
    }
}