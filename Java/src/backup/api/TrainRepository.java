package api;

public interface TrainRepository {
    Train retrieveBy(String trainId);

    void save(Train train);
}
