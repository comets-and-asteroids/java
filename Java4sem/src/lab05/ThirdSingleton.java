package lab05;

public class ThirdSingleton {
    private static final ThirdSingleton instance = new ThirdSingleton();

    public static ThirdSingleton getInstance() {
        return instance;
    }
}
