package poker;

import java.util.Comparator;
import java.util.Map;

public class SortCards implements Comparator<Map.Entry<Integer, Integer>> {

    public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b)
    {
        if (a.getValue() > b.getValue()){
            return 1;
        } else if (a.getValue() < b.getValue()){
            return -1;
        } else {
            return a.getKey() - b.getKey();
        }
    }
}
