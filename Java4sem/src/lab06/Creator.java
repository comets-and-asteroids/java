package lab06;

abstract class Creator {
    public abstract Sword factoryMethod();
    public void anOperator(){
        Sword sword = factoryMethod();
        sword.attack();
    }

}
