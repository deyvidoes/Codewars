public class Main {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
        System.out.println(reverseString2(s));

        System.out.println(spinWords("Hey wollef sroirraw"));
        System.out.println(countBits(15));

    }

    public static String spinWords(String sentence) {
        if(sentence.length() == 0 || sentence == null)
            return "";

        String [] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= 5)
                words[i] = reverseString(words[i]);
        }

        return String.join(" ", words);
    }

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--)
            sb.append(str.charAt(i));

        return sb.toString();
    }

    public static String reverseString2(String str){
        var charArr = str.toCharArray();

        var end = charArr.length - 1;
        for(int i = 0; i < charArr.length / 2; i++){
            var temp = charArr[i];
            charArr[i] = charArr[end];
            charArr[end--] = temp;

        }

        var result = new String(charArr);

        return result;
    }

    public static int countBits(int n){
        var result = 0;
        while(n > 0){
            if(n % 2 > 0)
                result++;
            n = n / 2;

        }
        return result;
    }

}
