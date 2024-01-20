package cricketscoreboard.scoreboard;

import cricketscoreboard.analytics.ProjectedScoreBoard;

public class CricketScoreBoard {

    private int runs;
    private int wickets;
    private float overs;
    private final ProjectedScoreBoard projectedScoreBoard;

    public CricketScoreBoard(ProjectedScoreBoard projectedScoreBoard) {
        this.projectedScoreBoard = projectedScoreBoard;
    }

    public void updateScore(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        projectedScoreBoard.update(this.runs, this.wickets, this.overs);
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



}
