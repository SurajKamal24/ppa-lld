package cricketscoreboard.subscribers.publishers;

import cricketscoreboard.subscribers.CricketSubscriber;
import cricketscoreboard.subscribers.FootBallSubscriber;

import java.util.List;

public class FootBallScorePublisher implements FootBallPublisher {

    private int goals1;
    private int goals2;
    private float duration;
    private List<CricketSubscriber> cricketSubscribers;

    @Override
    public void subscribe(FootBallSubscriber subscriber) {

    }

    @Override
    public void unsubscribe(FootBallSubscriber subscriber) {

    }

    @Override
    public void notifyAll(int goals1, int goals2, float duration) {

    }

    @Override
    public int getGoals1() {
        return this.goals1;
    }

    @Override
    public int getGoals2() {
        return this.goals2;
    }

    @Override
    public float getDuration() {
        return this.duration;
    }
}
