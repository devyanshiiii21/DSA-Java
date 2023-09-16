package Strings;


// Print the number of palindromic substrings
public class palindromicSS {
        public static void main(String[] args){
        String s = "abcba";
        System.out.println(substrings(s));
    }   

    public static int substrings(String s){
        String ans = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){  
                if (isPalindrome(s.substring(i,j)) == true){
                    count++;
                }
            }
        }
        return count;
    }
    private static Boolean isPalindrome(String ans){
        int i = 0;
        int j = ans.length()-1;

        // if(i == j)
        //     return true;
        while (i <= j) {
            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
 return true;
}
}