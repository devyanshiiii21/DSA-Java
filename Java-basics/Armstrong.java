import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n, N, rem=0;
        double sum=0.0;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        N=n;
        while(n>0){
            rem=n%10;
            sum=sum+ Math.pow(rem,3);
            n=n/10;
        }
        if(N==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
