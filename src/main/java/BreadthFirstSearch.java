import ds.JQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BreadthFirstSearch {
    public String search(String needle, Map<String, List<String>> haystack, String entryPoint) {
        JQueue<String> toVisit = new JQueue<>();
        List<String> visited = new ArrayList<>();
        List<String> entryPointNeighbours = haystack.get(entryPoint);

        for (String neighbour: entryPointNeighbours) {
            toVisit.push(neighbour);
        }

        while (toVisit.size() != 0) {
            String current = toVisit.pop();
            if (current.equals(needle)) {
                return current;
            } else {
                for (String neighbour : haystack.get(current)) {
                    if (!visited.contains(neighbour)) {
                        toVisit.push(neighbour);
                    }
                }
                visited.add(current);
            }
        }
        return null;
    }
}
