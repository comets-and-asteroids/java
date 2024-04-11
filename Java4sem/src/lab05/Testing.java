package lab05;

public class Testing {
    public static void main(String[] args) {
        FirstSingleton a = FirstSingleton.getSingleton();
        System.out.println("Singleton1 : " + a);
        SecondSingleton b = SecondSingleton.INSTANCE.getInstance();
        System.out.println("Singleton2 : " + b);
        ThirdSingleton c = ThirdSingleton.getInstance();
        System.out.println("Singleton3 : " + c);
    }
}
