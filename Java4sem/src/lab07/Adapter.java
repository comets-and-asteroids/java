package lab07;

public class Adapter implements Target{
    public Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter: Adapted request");
        adaptee.specificRequest();
    }
}
