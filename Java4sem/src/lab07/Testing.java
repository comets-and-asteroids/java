package lab07;

public class Testing {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();

        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("|||||||||||||||||||||||||||");
        System.out.println("+++++++++++++++++++++++++++");
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        adapter.request();
    }
}
