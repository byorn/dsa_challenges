package practice.cache;

public interface IReplacePolicy<K, V> {

    public void put(K key, V value);

    public K evict(K key);
}
