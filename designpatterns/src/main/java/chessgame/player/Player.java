package chessgame.player;

import chessgame.Move;

public abstract class Player {

    private final String name;

    protected Player(String name) {
        this.name = name;
    }

    public abstract Move makeMove();

    public String getName() {
        return name;
    }
}
