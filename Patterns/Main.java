import java.util.Scanner;

// *
// **
// ***
// ****


public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int n = sc.nextInt();
    pattern1(n);
}
public static void pattern1(int n){
    int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
}
}
}