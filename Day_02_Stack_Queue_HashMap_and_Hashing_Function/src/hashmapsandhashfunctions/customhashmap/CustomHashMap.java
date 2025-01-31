package hashmapsandhashfunctions.customhashmap;
import java.util.LinkedList;

// Creating Custom Hash Map
class CustomHashMap<K, V>
{
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;

    // Constructor of the class
    public CustomHashMap()
    {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            table[i] = new LinkedList<>();
        }
    }

    // Methode to generate hash code
    private int findHashCode(K key)
    {
        return key.hashCode() % SIZE;
    }

    // Setter method
    public void set(K key, V value)
    {
        int hash = findHashCode(key);
        LinkedList<Entry<K, V>> bucket = table[hash];

        for (Entry<K, V> entry : bucket)
        {
            if (entry.key.equals(key))
            {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    // getter method
    public V get(K key)
    {
        int hash = findHashCode(key);
        LinkedList<Entry<K, V>> bucket = table[hash];
        for (Entry<K, V> entry : bucket)
        {
            if (entry.key.equals(key))
            {
                return entry.value;
            }
        }
        return null;
    }

    // Method to remove key from hash map
    public void removeKey(K key)
    {
        int hash = findHashCode(key);
        LinkedList<Entry<K, V>> bucket = table[hash];
        bucket.removeIf(entry -> entry.key.equals(key));
    }

    private static class Entry<K, V>
    {
        K key;
        V value;

        Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
    }

    // Main method
    public static void main(String[] args)
    {
        CustomHashMap<String, Integer> custommap = new CustomHashMap<>();
        custommap.set("abc", 1);
        custommap.set("def", 2);

        System.out.println(custommap.get("abc"));
        custommap.removeKey("def");
        System.out.println(custommap.get("def"));

    }
}
