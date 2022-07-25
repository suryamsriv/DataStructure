import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    private String s;
    public FirstNonRepeatingChar(String s) {
        this.s = s;
    }

    public char findFirstNonRepeatingCharacter() {
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            var val = map.get(c);
            if(val != null) 
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for(char c: s.toCharArray()) {
            if(map.get(c) == 1)
                return c;
        }
        return (Character) null;
    }

    //M implementation
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();

        for(var ch: chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for(var ch: chars) {
            if(map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;

    }
}
