package HashTable;

public class gate {

    int key;
    Object value;
    gate next;

    public gate(int key, Object value){
        this.key = key;
        this.value = value;
        next = null;
    }

    public gate(){
        next = null;
    }

    public int getKey(){
        return key;
    }
    public Object getValue(){
        return value;
    }
}