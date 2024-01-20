package cricketscoreboard.subscribers.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

import java.util.ArrayList;
import java.util.List;

public class ESPNCricketScoreBoardPublisher implements CricketPublisher {

    private int runs;
    private int wickets;
    private float overs;
    private List<CricketSubscriber> subscribers;

    public ESPNCricketScoreBoardPublisher() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(CricketSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(CricketSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifyAll(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        for (CricketSubscriber subscriber : subscribers) {
            subscriber.update(this);
        }

    }

    @Override
    public int getRuns() {
        return 0;
    }

    @Override
    public float getOvers() {
        return 0;
    }

    @Override
    public int getWickets() {
        return 0;
    }

    public List<CricketSubscriber> getSubscribers() {
        return subscribers;
    }
}
