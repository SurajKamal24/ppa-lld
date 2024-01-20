package cricketscoreboard.subscribers;

import cricketscoreboard.subscribers.publishers.FootBallPublisher;

public interface FootBallSubscriber {

    void update(FootBallPublisher publisher);

}
