package lab08;

public interface Element {
    void accept(Visitor visitor);
    String getName();
}
