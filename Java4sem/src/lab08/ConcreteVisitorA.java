package lab08;

public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(Element element) {
        System.out.println("ConcreteVisitorA visited " + element.getName());
    }
}
