package lab03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockedMap<K, V> {
    private final Lock lock = new ReentrantLock();
    private final Map<K, V> map;

    public LockedMap(Map<K, V> map) {
        this.map = map;
    }

    public boolean isEmpty(){
        return map.isEmpty();
    }

    public int size(){
        return map.size();
    }

    public V get(K key){
        return map.get(key);
    }

    public V put(K key, V value){
        lock.lock();
        V val = map.put(key, value);
        lock.unlock();
        return val;
    }

    public V remove(K key){
        lock.lock();
        V val = map.remove(key);
        lock.unlock();
        return val;
    }
    public void putAll(Map<? extends K, ? extends V> m){
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

}