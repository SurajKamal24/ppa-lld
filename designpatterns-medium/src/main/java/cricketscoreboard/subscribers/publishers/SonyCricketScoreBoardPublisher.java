package cricketscoreboard.subscribers.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;

import java.util.ArrayList;
import java.util.List;

public class SonyCricketScoreBoardPublisher implements CricketPublisher {

    private int runs;
    private int wickets;
    private float overs;
    private List<CricketSubscriber> cricketSubscribers;

    public SonyCricketScoreBoardPublisher() {
        this.cricketSubscribers = new ArrayList<>();
    }

    public void subscribe(CricketSubscriber cricketSubscriber) {
        this.cricketSubscribers.add(cricketSubscriber);
    }

    public void unsubscribe(CricketSubscriber cricketSubscriber) {
        this.cricketSubscribers.remove(cricketSubscriber);
    }

    public void notifyAll(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        for (CricketSubscriber cricketSubscriber : cricketSubscribers) {
            cricketSubscriber.update(this);
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

}
