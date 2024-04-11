package lab06;

public class ConcretePrototype2 implements Prototype{
    private int num;

    public ConcretePrototype2(int num) {
        this.num = num;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.num);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "num=" + num +
                '}';
    }

}
