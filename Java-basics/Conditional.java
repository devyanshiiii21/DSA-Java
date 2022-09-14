import java.util.*;

// Make a Calculator using If-else and switch

public class Conditional {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    char operator = sc.next().charAt(0);
    
    // If else
    // if(operator == '+'){
    //     System.out.println(a+b);
    // }
    // else if( operator == '-'){
    //     System.out.println(a-b);
    // }
    // else if( operator == '*'){
    //     System.out.println(a*b);
    // }
    // else if( operator == '/'){
    //     System.out.println(a/b);
    // }
    // else{
    //     System.out.println("Invalid choice");
    // }

    // Switch
    switch(operator){
        case '+':
        System.out.println(a+b);
        break;
        case '-':
        System.out.println(a-b);
        break;
        case '*':
        System.out.println(a*b);
        break;
        case '/':
        System.out.println(a/b);
        break;
        default:
        System.out.println("Invalid case");
        break;
    }
    
    }
}
