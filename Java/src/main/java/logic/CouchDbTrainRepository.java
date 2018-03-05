package logic;

public class CouchDbTrainRepository implements TrainRepository {
    @Override
    public Train getTrainBy(String trainId) {
        return new TrainWithCoaches();
    }
}
