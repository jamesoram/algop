public class Substring {
    public int lengthOfLongestSubstring(String s) {
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

