/**
 * Created by amour on 15.03.2018.
 */
public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("A",123);
        hashMap.put("A",444);
        hashMap.put("A",777);
        hashMap.put("B",122);

        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.get("B"));


    }
}
