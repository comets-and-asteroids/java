package lab08;

public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "#CEA";
    }
}
