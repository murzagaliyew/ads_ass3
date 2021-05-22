package HashTable;

public class hta<T> {

    gate[] arr;
    int len;

    public hta(int len){
        this.len = len;
        arr = new gate[len];

        for(int i=0; i<len; i++)
            arr[i] = new gate();
    }

    int GetHash(int key){
        return key%len;
    }

    public void set(int key, Object value){
        int ind = GetHash(key);
        gate ArrValue = arr[ind];
        gate newElement = new gate(key, value);
        newElement.next = ArrValue.next;
        ArrValue.next = newElement;
    }

    public T get(int key){
        T value = null;
        int ind = GetHash(key);
        gate ArrValue = arr[ind];

        while (ArrValue != null){
            if (ArrValue.getKey()==key){
                value=(T) ArrValue.getValue();
                break;
            }

            ArrValue = ArrValue.next;
        }
        return value;
    }
}
