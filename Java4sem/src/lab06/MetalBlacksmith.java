package lab06;

public class MetalBlacksmith extends Blacksmith{
    @Override
    public Shield factoryMethod() {
        return new MetalShield();
    }
}
