import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLongestSubstring {

    Substring ss = new Substring();

    @Test
    void emptyString() {
        assertEquals(0,
                ss.lengthOfLongestSubstring(""));
    }

    @Test
    void noRepeatingCharacters() {
        assertEquals(4,
                ss.lengthOfLongestSubstring("absc"));
    }

    @Test
    void threeRepeatedLetters() {
        assertEquals(3,
                ss.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void sameCharManyTimes() {
        assertEquals(1,
                ss.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void garbled() {
        assertEquals(3,
                ss.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void simpleAAB() {
        assertEquals(2,
                ss.lengthOfLongestSubstring("aab"));
    }

    @Test
    void simpleDVDF() {
        assertEquals(3,
                ss.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void moreGarbled() {
        assertEquals(5,
                ss.lengthOfLongestSubstring("qrsvbspk"));
    }
}
