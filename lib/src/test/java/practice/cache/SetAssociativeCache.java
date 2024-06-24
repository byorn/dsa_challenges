package practice.cache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SetAssociativeCache<K, V> {

    int setSize;
    int numberOfSets;

    public Map<K, V>[] sets;

    public Map<K, Integer> keyToSetMap;

    private IReplacePolicy<K, V> replacePolicy;

    public SetAssociativeCache(int setSize, int numberOfSets, IReplacePolicy<K, V> replacePolicy) {
            this.setSize = setSize;
            this.numberOfSets = numberOfSets;
            sets = new LinkedHashMap[numberOfSets];
            for (int i = 0; i < numberOfSets; i++) {
                sets[i] = new LinkedHashMap<>(setSize, 0.75f, true);
            }
            keyToSetMap = new HashMap<>();
            this.replacePolicy = replacePolicy;
    }

    public int getSetIndex(K key){
        return key.hashCode() % numberOfSets;
    }

    public void put(K key, V value) {

        int setIndex = getSetIndex(key);
        if(!sets[setIndex].containsKey(key) && sets[setIndex].size() >= setSize){
             sets[setIndex].remove(replacePolicy.evict(key));
        }
        this.sets[setIndex].put(key, value);
        replacePolicy.put(key, value);
        keyToSetMap.put(key, setIndex);
        this.setSize++;
    }

    public V get(K key) {
        int setIndex = getSetIndex(key);
        if (sets[setIndex] == null) {
            return null;
        }else{
            return sets[setIndex].get(key);
        }
    }
}


