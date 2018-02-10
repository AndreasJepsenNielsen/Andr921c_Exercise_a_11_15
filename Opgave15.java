import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Opgave15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(9);

        maxOccurences(list);
    }

    public static int maxOccurences(List<Integer> a){
        Map<Integer, Integer> map = new TreeMap<>();
        int count = 0;
        if(!a.isEmpty()) {count = 1;} // count vil altid være 1 så længe der er ord i listen

        for (int i = 0; i < a.size() ; i++) {
            Integer inter = a.get(i);
            if(!map.containsKey(inter)){ // hvis map ikke indeholder værdien inter

                map.put(a.get(i),1);

            }else if(map.size()>0){
                count++;
            }

        }
        System.out.println(count); // udskriver mængden af max occurences
        return count;
    }
}
