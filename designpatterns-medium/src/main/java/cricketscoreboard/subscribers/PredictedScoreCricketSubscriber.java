package cricketscoreboard.subscribers;


import cricketscoreboard.subscribers.publishers.CricketPublisher;
import cricketscoreboard.subscribers.publishers.FootBallPublisher;
import cricketscoreboard.subscribers.publishers.FootBallScorePublisher;
import cricketscoreboard.subscribers.publishers.Publisher;

import java.util.List;

public class PredictedScoreCricketSubscriber implements CricketSubscriber, FootBallSubscriber {

    private int runs;
    private int wickets;
    private float overs;
    private int goals1;
    private int goals2;
    private float duration;
    private List<Publisher> publishers;

    public PredictedScoreCricketSubscriber(List<Publisher> publishers) {
        this.publishers = publishers;
        for (Publisher publisher : this.publishers) {
            publisher.subscribe(this);
        }
    }

    @Override
    public void update(Publisher publisher) {
        if (publisher instanceof FootBallScorePublisher) {
            this.goals1 = publisher.getGoals1();
        } else {
            this.runs = publisher.getRuns();
            this.wickets = publisher.getWickets();
            this.overs = publisher.getOvers();
        }

        // additional logic
        System.out.println("In PredictedScoreSubscriber : " + this.runs + " runs," + this.wickets + " wickets," + this.overs + " overs.");
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public float getOvers() {
        return overs;
    }

    public List<Publisher> getPublisher() {
        return publishers;
    }

    @Override
    public void update(CricketPublisher publisher) {
        
    }

    @Override
    public void update(FootBallPublisher publisher) {

    }
}
