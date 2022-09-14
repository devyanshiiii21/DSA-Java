import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N;
        int count=0;
        System.out.print("Enetr the number: ");
        N=sc.nextInt();
        for(i=1;i<=N;i++){
            if(N%i==0){
             count+=1;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }

    }
}
