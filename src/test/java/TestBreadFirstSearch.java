import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestBreadFirstSearch {

    private BreadthFirstSearch bfs = new BreadthFirstSearch();

    @Test
    void testFindShortestPath() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("James", new ArrayList<>() {{
            add("John");
            add("Jane");
            add("Jud");
        }});
        graph.put("John", new ArrayList<>() {{
            add("Jane");
        }});
        graph.put("Jane", new ArrayList<>() {{
            add("Jud");
            add("Kate");
        }});
        graph.put("Jud", new ArrayList<>());

        String result = bfs.search("Kate", graph, "James");
        assertEquals("Kate", result);
    }
}
