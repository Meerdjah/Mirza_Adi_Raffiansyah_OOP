import java.util.HashMap;

public class LibraryCollection<T> {
    private HashMap<String, T> items;

    public LibraryCollection(HashMap<String,T> items) {
        this.items = items;
    }

    public void addItem(String key, T item) {
        items.put(key, item);
    }

    public T getItem(String key) {
        return items.get(key);
    }

    public HashMap<String, T> getAllItems() {
        return items;
    }
}