package lab06;

public class ManaBlacksmith extends Blacksmith{
    @Override
    public Shield factoryMethod() {
        return new ManaShield();
    }
}
