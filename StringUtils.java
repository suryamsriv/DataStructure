public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;
        int count = 0;
        String vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray())
            if (vowels.indexOf(ch) != -1)
                count++;

        return count;
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (var i = str.length(); i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }
}
