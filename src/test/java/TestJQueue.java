import ds.JQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestJQueue {

    private JQueue<Integer> jq = new JQueue<>();

    @Test
    void testCanPushAnItemOnToQueue() {
        jq.push(1);
        assertEquals(jq.size(), 1);
    }

    @Test
    void testCanPopSingleItemFromQueue() {
        jq.push(23);
        assertEquals(23, jq.pop());
    }

    @Test
    void testCanPopItemFromBusyQueue() {
        jq.push(23);
        for (int i = 0; i < 11; i++) {
            jq.push(i);
        }
        assertEquals(23, jq.pop());
        assertEquals(0, jq.pop());
        assertEquals(1, jq.pop());
    }
}
