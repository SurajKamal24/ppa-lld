package cricketscoreboard.subscribers;


import cricketscoreboard.subscribers.publishers.CricketPublisher;

import java.util.List;

public class RunrateCricketSubscriber implements CricketSubscriber {

    private int runs;
    private int wickets;
    private float overs;
    private List<CricketPublisher> publishers;

    public RunrateCricketSubscriber(List<CricketPublisher> publishers) {
        this.publishers = publishers;
    }

    @Override
    public void update(CricketPublisher publisher) {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        // additional logic
        System.out.println("In RunrateSubscriber : " + this.runs + " runs," + this.wickets + " wickets," + this.overs + " overs.");
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

    public List<CricketPublisher> getPublisher() {
        return publishers;
    }
}
