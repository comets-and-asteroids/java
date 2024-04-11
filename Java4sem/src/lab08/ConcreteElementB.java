package lab08;

public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "#CEB";
    }
}
