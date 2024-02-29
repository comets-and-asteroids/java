package lab03;

import java.util.HashMap;

public class Testing {
    public static void main(String[] args) {
        LockedMap<Integer, String> lockedMap = new LockedMap<>(new HashMap<>());
        lockedMap.put(1, "adasd");
        System.out.println(lockedMap.get(1));
    }
}
