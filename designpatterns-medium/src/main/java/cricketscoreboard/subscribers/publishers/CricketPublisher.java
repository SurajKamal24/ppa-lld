package cricketscoreboard.subscribers.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

public interface CricketPublisher {

    void subscribe(CricketSubscriber cricketSubscriber);
    void unsubscribe(CricketSubscriber cricketSubscriber);
    void notifyAll(int runs, int wickets, float overs);
    int getRuns();
    float getOvers();
    int getWickets();
}
