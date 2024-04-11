package lab06;

public class Testing {
    public static void main(String[] args) {
        FireSwordCreator fireSwordCreator = new FireSwordCreator();
        fireSwordCreator.factoryMethod().attack();
        MetalBlacksmith metalBlacksmith = new MetalBlacksmith();
        metalBlacksmith.factoryMethod().protect();
        ManaBlacksmith manaBlacksmith = new ManaBlacksmith();
        manaBlacksmith.factoryMethod().protect();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        director.construct().show();
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2(5);
        ConcretePrototype2 concretePrototype = (ConcretePrototype2) concretePrototype2.clone();
        System.out.println(concretePrototype);
    }
}
