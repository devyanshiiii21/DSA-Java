import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();  
        int b = sc.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + GCD(a, b));   
    }  
   
       public static int GCD(int a, int b)   
    {   
    if (b == 0)   
    return a;     
    return GCD(b, a % b);   
}   
}  
    

