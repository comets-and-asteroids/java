package lab08;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague col : colleagues) {
            if (col != colleague) {
                col.receiveMessage(message);
            }
        }
    }
}
