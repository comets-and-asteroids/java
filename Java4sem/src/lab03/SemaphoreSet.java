package lab03;

import java.util.Set;
import java.util.concurrent.Semaphore;

public class SemaphoreSet<T> {
    private final Set<T> set;
    private final Semaphore semaphore = new Semaphore(2);

    public SemaphoreSet(Set<T> set) throws InterruptedException {
        semaphore.acquire();
        this.set = set;
        semaphore.release();
    }

    public int size(){
        return set.size();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public boolean contains(T obj){
        return set.contains(obj);
    }

    public T[] toArray(T[] a){
        return set.toArray(a);
    }

    public boolean add(T obj){
        return set.add(obj);
    }

    public void remove(T obj) throws InterruptedException {
        semaphore.acquire();
        set.remove(obj);
        semaphore.release();
    }
    public void clear() throws InterruptedException {
        semaphore.acquire();
        set.clear();
        semaphore.release();
    }
}
