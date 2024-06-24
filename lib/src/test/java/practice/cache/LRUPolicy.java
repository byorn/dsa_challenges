package practice.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUPolicy<K, V>  implements IReplacePolicy<K, V>{


    private Map<K, V> map;

    @Override
    public void put(K key, V value) {
        if (map == null){
            map = new HashMap<>();
        }
        map.put(key, value);
    }

    @Override
    public K evict(K key) {
        return map.keySet().iterator().next();

    }
}
