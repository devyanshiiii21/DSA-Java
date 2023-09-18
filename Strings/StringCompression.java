package Strings;

public class StringCompression {
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','b'};
        System.out.println(compress(chars));
    }

    public static char[] compress(char[] chars) {
        int count = 1;
        String str = new String(chars);
        String ans = "" + str.charAt(0);
        
        for(int i = 1; i< chars.length; i++){
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                if(count>1)
                    ans += count;
                count = 1;
                ans += str.charAt(i);
            }     
        }
        if(count>1)
            ans += count;
        chars = ans.toCharArray();
        return chars;
    }
}
