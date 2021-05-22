package HashTable;

public class htaMain {

    public static void main(String[] args){
        hta<String> hMap = new hta<String>(15);

        hMap.set(16, "Alikhan");
        hMap.set(17, "Arman");
        hMap.set(18, "Aruzhan");
        hMap.set(19, "Ayazhan");

        System.out.println(hMap.get(18));
    }
}