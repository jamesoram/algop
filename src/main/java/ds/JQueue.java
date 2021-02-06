package ds;

import java.util.ArrayList;
import java.util.List;

public class JQueue<T> {

    List<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }

    public T pop() {
        T item = items.get(0);
        items.remove(0);
        return item;
    }
}
