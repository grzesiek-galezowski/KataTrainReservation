package logic;

public class CouchDbTrainRepository implements TrainRepository {
    @Override
    public Train getTrainBy(String trainId) {
        //todo there should be something passed here!!
        return new TrainWithCoaches(
            new CoachWithSeats()
        );
    }
}
