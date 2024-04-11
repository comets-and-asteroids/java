package lab08;

public class ConcreteVisitorB implements Visitor{
    @Override
    public void visit(Element element) {
        System.out.println("ConcreteVisitorB visited " + element.getName());
    }
}