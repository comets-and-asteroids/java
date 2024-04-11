package lab05;

public class FirstSingleton {
    private final String text;
    private static FirstSingleton firstSingleton;

    private FirstSingleton(String text) {
        this.text = text;
    }

    public static FirstSingleton getSingleton(){
        if (firstSingleton == null){
            firstSingleton = new FirstSingleton("Hello world");
        }
        return firstSingleton;
    }

    public String getText() {
        return text;
    }
}
