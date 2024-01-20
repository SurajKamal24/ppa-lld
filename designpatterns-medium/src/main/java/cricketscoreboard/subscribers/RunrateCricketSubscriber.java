package cricketscoreboard.subscribers;


import cricketscoreboard.subscribers.publishers.Publisher;

import java.util.List;

public class RunrateCricketSubscriber implements CricketSubscriber {

    private int runs;
    private int wickets;
    private float overs;
    private List<Publisher> publishers;

    public RunrateCricketSubscriber(List<Publisher> publishers) {
        this.publisher = publisher;
    }

    @Override
    public void update(Publisher publisher) {
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

    public List<Publisher> getPublisher() {
        return publishers;
    }
}
