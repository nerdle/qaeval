package de.tu_berlin.dima;

public class ScoreJudgment extends Judgment {
    private double score;

    public ScoreJudgment() {
        super();
    }

    public ScoreJudgment(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
