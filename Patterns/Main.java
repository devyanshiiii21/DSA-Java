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
    pattern4(n);
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
// ****
// ***
// **
// *


 public static void pattern2(int n)
{
    int i,j;
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
             System.out.print("*");
        }

        System.out.print("\n");
    }
}


//    *
//   **
//  ***
// ****
public static void pattern3(int n)
{
    int i,j;
    for(i=1;i<=n;i++)
    {
        for(j=n;j>=1;j--)
        {
            if(j<=i)
            {
          System.out.print("*");
            }        
             else
             {
                 System.out.print(" ");
             }
            }

        System.out.print("\n");
    }
}

// ****
//  ***
//   **
//    *

public static void pattern4(int n)
{
    int i,j;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(j>=i)
            {
          System.out.print("*");
            }        
             else
             {
                 System.out.print(" ");
             }
            }
            System.out.println("");
        }
    }
}