package lab06;
class ConcretePrototype implements Prototype {
    private int num;

    public ConcretePrototype(int num) {
        this.num = num;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.num);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field=" + num +
                '}';
    }
}