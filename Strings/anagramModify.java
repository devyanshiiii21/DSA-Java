// An anagram is a word whose characters can be rearranged to create another word. Given two strings, determine the minimum number of characters in either string that must be modified to make the two strings anagrams. If it is not possible to make the two strings anagrams, return -1.
// Example:
// a = ['tea', 'tea', 'act]
// b = ['ate' 'toe' 'acts']

// • a[0] = tea and b[0] = ate are anagrams, so 0 characters need to be modified.
// • a[1] = tea and b[1] = toe are not anagrams. Modify 1 character in either string (o - a or a - o) to make them anagrams.
// • a[2] = act and b[2] = acts are not anagrams and cannot be converted to anagrams because they contain different numbers of characters.
// • The return array is [0, 1, -1]

package Strings;

public class anagramModify {
    public static void main(String[] args){
        String[] str = {"tea", "tea", "act"};
        String[] gtr = {"tea", "toe", "acts"};
        int [] ans = anagram_modify(str ,gtr);
    }

    public static int[] anagram_modify(String[] str, String[] gtr){
        int[] ans = new int[str.length];
        for(int i = 0; i < str.length; i++){
        }
        
        
        return ans;
    }
}
