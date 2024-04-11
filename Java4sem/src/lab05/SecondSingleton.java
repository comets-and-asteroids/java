package lab05;

public enum SecondSingleton {
    INSTANCE;
    private int num;
    public SecondSingleton getInstance(){
        INSTANCE.num = 10;
        return INSTANCE;
    }
    public int getNum(){
        return num;
    }
}
