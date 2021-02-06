import java.util.HashSet;
import java.util.Set;

public class Substring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int answer = 0;
        int i = 0;
        int j = 0;
        int n = s.length();

        while (i < n && j < n) {
            if (!window.contains(s.charAt(j))) {
                window.add(s.charAt(j++));
                answer = Math.max(answer, j - i);
            } else {
                window.remove(s.charAt(i++));
            }
        }
        return answer;
    }

    public int solution1(String s) {
        String longestSubstring = "";
        String currentLongestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (!currentLongestSubstring.contains(c)) {
                currentLongestSubstring += c;
            } else {
                currentLongestSubstring =
                        currentLongestSubstring.substring(
                                currentLongestSubstring.indexOf(c)
                                        + 1) + c;
            }
            if (currentLongestSubstring.length() >
                    longestSubstring.length()) {
                longestSubstring = currentLongestSubstring;
            }
        }
        return longestSubstring.length();
    }
}

