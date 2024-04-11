package lab06;

public class FireSwordCreator extends Creator{
    @Override
    public Sword factoryMethod() {
        return new FireSword();
    }
}

