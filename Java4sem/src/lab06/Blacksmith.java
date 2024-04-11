package lab06;

public abstract class Blacksmith {

    public abstract Shield factoryMethod();
    public void anOperator(){
        Shield shield = factoryMethod();
        shield.protect();
    }
}
