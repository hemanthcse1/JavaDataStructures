package hashTable;

public class HashNode {
    public Integer key; // can be generic type
    public String value; // can be generic type
    public HashNode next; // referrence to the next hashNode

    public HashNode(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


}
