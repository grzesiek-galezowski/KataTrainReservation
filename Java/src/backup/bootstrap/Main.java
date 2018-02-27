package bootstrap;

import api.PersistentTrainRepository;
import api.TicketOffice;

public class Main {

    public static void main(String[] args) {
        new TicketOffice( //todo implement
            new MyCommandFactory(
                new PersistentTrainRepository()),
            new PlainTicketFactory());

    }

}
