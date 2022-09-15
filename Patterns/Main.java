import java.util.Scanner;

// *
// **
// ***
// ****

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        pattern12(n);
    }

    public static void pattern1(int n) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    // ****
    // ***
    // **
    // *

    public static void pattern2(int n) {
        int i, j;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    // *
    // **
    // ***
    // ****
    public static void pattern3(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }

    // ****
    // ***
    // **
    // *

    public static void pattern4(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // 54321
    // 4321
    // 321
    // 21
    // 1

    public static void pattern5(int n) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    // *****
    // * *
    // * *
    // * *
    // *****

    public static void pattern6(int n) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    // *
    // **
    // * *
    // * *
    // *****

    public static void pattern7(int n) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j == 1 || i == 5 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    // 1
    // 23
    // 456
    // 78910

    public static void pattern8(int n) {
        int i, j, k = 1;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.print("\n");
        }
    }

    // 1
    // 12
    // 123
    // 1234
    // 12345

    public static void pattern9(int n) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void pattern10(int n) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    // ABCDEFGFEDCBA
    // ABCDEF FEDCBA
    // ABCDE   EDCBA
    // ABCD     DCBA
    // ABC       CBA
    // AB         BA
    // A           A

    public static void pattern11(int n) {
        int i, j;
        for (i = 7; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + 64);
            }
            System.out.print("\n");
        }
        for (i = 7; i >= 1; i--) {
            for (j = 1; j <= i; i++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + 64);
            }
            System.out.print("\n");
        }
    }

    // 1234554321
    // 1234  4321
    // 123    321
    // 12      21
    // 1        1

public static void pattern12(int n)
{
    int i,j,k,m;
    for(i=5;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
           System.out.print(j);
        }
        for(k=5;k>j-1;k--)
        {
            System.out.print(" ");
        }
        for(m=i;m<5;m++)
        {
            System.out.print(" ");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print(j);
        }
       System.out.print("\n");
    }
}
}
