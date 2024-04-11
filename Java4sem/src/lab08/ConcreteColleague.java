package lab08;

class ConcreteColleague implements Colleague {
    private final Mediator mediator;
    public ConcreteColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}