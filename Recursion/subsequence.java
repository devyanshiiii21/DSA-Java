import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static List<String> find_permutation(String S) {
        // Code here
        ArrayList<String> list = new ArrayList<>();
        helper(S, 0, "", list);
        return list;
    }
    
    private static void helper(String S, int index, String newStr, ArrayList<String> list){
        if(index == S.length()){
            list.add(newStr);
            return;
        }
        
        char currChar = S.charAt(index);
        helper(S, index+1, newStr + currChar, list);
        helper(S, index+1, newStr, list);
        
    }

    public static void main(String args[]){
        String str = "abc";
        System.out.println(find_permutation(str));
    }
}
