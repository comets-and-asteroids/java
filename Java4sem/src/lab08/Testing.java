package lab08;

public class Testing {
    public static void main(String[] args) {
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        elementA.accept(visitorA);
        elementB.accept(visitorB);
        elementA.accept(visitorB);
        elementB.accept(visitorA);

        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague colleague1 = new ConcreteColleague(mediator);
        ConcreteColleague colleague2 = new ConcreteColleague(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.sendMessage("Hello, colleague2!");
        colleague2.sendMessage("Hi, colleague1!");
    }
}
