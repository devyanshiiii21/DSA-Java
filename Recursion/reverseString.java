public class reverseString {
    public static void main(String args[]){
        String value = "abcd";
        int index = 0;

        System.out.println("Head Recursion");
        headRecursion(index, value);
        System.out.println();
        System.out.println("Tail Recursion");
        tailRecursion(3, value);
    }

    public static void headRecursion(int i, String value){
        if(i == value.length())
            return;

        headRecursion(i+1, value);
        System.out.print(value.charAt(i) + " ");
        
    }

    public static void tailRecursion(int i, String value){
        if(i == -1)
            return;

        System.out.print(value.charAt(i)+ " ");
        tailRecursion(i-1, value);
        
    }
}
