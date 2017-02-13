package ua.kyiv.rvysh.yatzy.engine.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtils {
    private MapUtils() {
    }

    public static <K, V> void addToValuesList(Map<K, List<V>> map, K key, V value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<V>());
        }
        map.get(key).add(value);
    }
    
    public static <K, V> Map<K, List<V>> findTuplesNotShorterThan(Map<K, List<V>> map, int length) {
        Map<K, List<V>> result = new HashMap<K, List<V>>();
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            if (entry.getValue().size() >= length) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
