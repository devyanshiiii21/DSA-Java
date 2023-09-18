package Strings;

public class reverseWords {

    public static String reverse(String s) {
        String[] temp = s.split("\\s+");
        String result = "";
 
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result.trim();
    }

    public static void main(String[] args){
        String s = "   the sky      is blue   ";
        System.out.println(reverse(s));
    }
}

