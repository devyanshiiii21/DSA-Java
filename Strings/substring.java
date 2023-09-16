package Strings;


// Print all the substrings
public class substring {
    public static void main(String[] args){
        String s = "abcd";
        System.out.println(substrings(s));
    }   

    public static String substrings(String s){
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){  
                ans += s.substring(i,j) + " "; 
            }
        }

        return ans;
    }
}




