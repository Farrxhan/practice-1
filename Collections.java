
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Automation");
        arrayList.add("Testing");
        System.out.println("ArrayList elements: " + arrayList);

        
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(101);
        hashSet.add(201);
        hashSet.add(301);
        System.out.println("HashSet elements: " + hashSet);

        
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Police");
        hashMap.put(108, "Ambulence");
        hashMap.put(911, "Emergency");
        System.out.println("HashMap elements: " + hashMap);

       
        System.out.println("Iterating through HashSet:");
        Iterator<Integer> setIterator = hashSet.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

     
        System.out.println("Iterating through HashMap:");
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

