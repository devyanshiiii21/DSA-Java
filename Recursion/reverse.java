public class reverse{
    static int sum =0;
    

    public static void rev(int n) {
        int lastDigit;
        
        if (n== 0) {
            return;
        } 
        else {
            lastDigit =  n % 10 ;
            sum = (sum * 10) + lastDigit;
            rev(n/10);
        }
    }

    public static int helper(int n, int digits){
        // base case
        if(n%10 == n)
            return n;
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static int noOfDigits(int n){
        int digits = (int)(Math.log10(n)) +1;
        return helper(n, digits);
    }


    public static void main(String[] args) {
    
    System.out.println(noOfDigits(2754));
    }
}


