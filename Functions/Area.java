import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Rectangle();
        Circle();
        Square();
    }

public static void Circle(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius:");
    int R = sc.nextInt();
    double area = 3.14*R*R;
    System.out.println("The area of circle="+area);
}

public static void Rectangle(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Length and Breath:");
    int L= sc.nextInt();
    int B= sc.nextInt();
    double area = L*B;
    System.out.println("The area of rectangle="+area);
}

public static void Square(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Side:");
    int side = sc.nextInt();
    
    double area = side * side;
    System.out.println("The area of square="+area);
}

}