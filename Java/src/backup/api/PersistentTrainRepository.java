package api;

import com.google.common.collect.Lists;

public class PersistentTrainRepository implements TrainRepository {
    @Override
    public Train retrieveBy(String trainId) {

        return new TrainWithCoaches(
            Lists.newArrayList(
                new DefaultCoach(new NamedSeat(12, "coach1")),
                new DefaultCoach(new NamedSeat(13, "coach2"))));
    }

    @Override
    public void save(Train train) {
        //todo implement

    }
}
