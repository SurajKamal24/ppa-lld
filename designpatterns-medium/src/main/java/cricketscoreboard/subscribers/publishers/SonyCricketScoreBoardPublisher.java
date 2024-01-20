package cricketscoreboard.subscribers.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

import java.util.ArrayList;
import java.util.List;

public class SonyCricketScoreBoardPublisher implements CricketPublisher {

    private int runs;
    private int wickets;
    private float overs;
    private List<CricketSubscriber> subscribers;

    public SonyCricketScoreBoardPublisher() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(CricketSubscriber cricketSubscriber) {
        this.subscribers.add(cricketSubscriber);
    }

    public void unsubscribe(CricketSubscriber cricketSubscriber) {
        this.subscribers.remove(cricketSubscriber);
    }

    public void notifyAll(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        for (CricketSubscriber cricketSubscriber : subscribers) {
            cricketSubscriber.update(this);
        }

    }

    @Override
    public int getRuns() {
        return runs;
    }

    @Override
    public float getOvers() {
        return overs;
    }

    @Override
    public int getWickets() {
        return wickets;
    }

    public List<CricketSubscriber> getSubscribers() {
        return subscribers;
    }
}
