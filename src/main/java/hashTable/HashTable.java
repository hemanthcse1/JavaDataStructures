package hashTable;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; // capacity
    private int size; // number of key value pairs in hashtable

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(int key, String value) {

    }

    public String get(int key) {
        return null;
    }

    public String remove(int key){
        return null;
    }

}
