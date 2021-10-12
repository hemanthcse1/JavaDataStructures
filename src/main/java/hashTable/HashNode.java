package hashTable;

public class HashNode {
    private Integer key; // can be generic type
    private String value; // can be generic type
    private HashNode next; // referrence to the next hashNode

    public HashNode(Integer key, String value) {
        this.key = key;
        this.value = value;
    }


}
