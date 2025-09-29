package hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyNumber {
    private static final Map<Integer, Integer> map = new HashMap<>();
    int[] arr = {1,2,3,2,1,3,2,12};
    public void getFrequencyOfNumber(){
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.replace(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
    }
    public int highestFrequencyElement(){
        Map.Entry<Integer, Integer> hEntry = Map.entry(0,0);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > hEntry.getValue()){
                hEntry = entry;
            }
        }
        return hEntry.getKey();
    }
    public int lowestFrequencyElement(){
        Map.Entry<Integer, Integer> hEntry = Map.entry(0,Integer.MAX_VALUE);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() < hEntry.getValue()){
                hEntry = entry;
            }
        }
        return hEntry.getKey();
    }

    public static void main(String[] args) {
        HighestAndLowestFrequencyNumber x = new HighestAndLowestFrequencyNumber();
        x.getFrequencyOfNumber();
        System.out.println(x.highestFrequencyElement());
        System.out.println(x.lowestFrequencyElement());
    }
}
