package cricketscoreboard.subscribers;

import cricketscoreboard.subscribers.publishers.CricketPublisher;

public interface CricketSubscriber {

    void update(CricketPublisher publisher);

}
