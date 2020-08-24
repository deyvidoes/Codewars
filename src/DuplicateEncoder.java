import java.util.HashMap;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
    }

    //The goal of this exercise is to convert a string to a new string where each character in the new string
    // is "(" if that character appears only once in the original string, or
    // ")" if that character appears more than once in the original string.
    // Ignore capitalization when determining if a character is a duplicate.

    //Examples
    //"din"      =>  "((("
    //"recede"   =>  "()()()"
    //"Success"  =>  ")())())"
    //"(( @"     =>  "))(("

    public static String encode(String word){
        if(word == null || word.length() == 0)
            return "";

        var map = new HashMap<Character, Integer>();
        for(var ch : word.toLowerCase().toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        var sb = new StringBuilder();
        for(var ch : word.toLowerCase().toCharArray()){
            var size = map.get(ch);
            if(size == 1)
                sb.append('(');
            else
                sb.append(')');
        }

        return sb.toString();
    }
}
