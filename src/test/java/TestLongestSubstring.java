import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLongestSubstring {

    Substring ss = new Substring();

    @Test
    void emptyString() {
        assertEquals(0,
                ss.solution1(""));
    }

    @Test
    void noRepeatingCharacters() {
        assertEquals(4,
                ss.solution1("absc"));
    }

    @Test
    void threeRepeatedLetters() {
        assertEquals(3,
                ss.solution1("abcabcbb"));
    }

    @Test
    void sameCharManyTimes() {
        assertEquals(1,
                ss.solution1("bbbbb"));
    }

    @Test
    void garbled() {
        assertEquals(3,
                ss.solution1("pwwkew"));
    }

    @Test
    void simpleAAB() {
        assertEquals(2,
                ss.solution1("aab"));
    }

    @Test
    void simpleDVDF() {
        assertEquals(3,
                ss.solution1("dvdf"));
    }

    @Test
    void moreGarbled() {
        assertEquals(5,
                ss.solution1("qrsvbspk"));
    }
}
