package lk.cinec;

public class Team implements Comparable<Team> {

    private int place;
    private String teamName;
    private int compete;
    private int win;
    private int drawn;
    private int lose;
    private int scoredFor;
    private int scoredAgainst;
    private int scoredDifference;
    private int attemptFor;
    private int attemptAgainst;
    private int attemptBonus;
    private int lostBonus;
    private int score;

    public Team(int place,
                String teamName,
                int compete,
                int win,
                int drawn,
                int lose,
                int scoredFor,
                int scoredAgainst,
                int scoredDifference,
                int attemptFor,
                int attemptAgainst,
                int attemptBonus,
                int lostBonus,
                int score) {

        this.place = place;
        this.teamName = teamName;
        this.compete = compete;
        this.win = win;
        this.drawn = drawn;
        this.lose = lose;
        this.scoredFor = scoredFor;
        this.scoredAgainst = scoredAgainst;
        this.scoredDifference = scoredDifference;
        this.attemptFor = attemptFor;
        this.attemptAgainst = attemptAgainst;
        this.attemptBonus = attemptBonus;
        this.lostBonus = lostBonus;
        this.score = score;
    }



    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getCompete() {
        return compete;
    }

    public void setCompete(int compete) {
        this.compete = compete;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getDrawn() {
        return drawn;
    }

    public void setDrawn(int drawn) {
        this.drawn = drawn;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getScoredFor() {
        return scoredFor;
    }

    public void setScoredFor(int scoredFor) {
        this.scoredFor = scoredFor;
    }

    public int getScoredAgainst() {
        return scoredAgainst;
    }

    public void setScoredAgainst(int scoredAgainst) {
        this.scoredAgainst = scoredAgainst;
    }

    public int getScoredDifference() {
        return scoredDifference;
    }

    public void setScoredDifference(int scoredDifference) {
        this.scoredDifference = scoredDifference;
    }

    public int getAttemptFor() {
        return attemptFor;
    }

    public void setAttemptFor(int attemptFor) {
        this.attemptFor = attemptFor;
    }

    public int getAttemptAgainst() {
        return attemptAgainst;
    }

    public void setAttemptAgainst(int attemptAgainst) {
        this.attemptAgainst = attemptAgainst;
    }

    public int getAttemptBonus() {
        return attemptBonus;
    }

    public void setAttemptBonus(int attemptBonus) {
        this.attemptBonus = attemptBonus;
    }

    public int getLostBonus() {
        return lostBonus;
    }

    public void setLostBonus(int lostBonus) {
        this.lostBonus = lostBonus;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Team o) {
        return Integer.compare(scoredFor, o.scoredFor);
    }

    @Override
    public String toString() {
        return String.format("%-3d%-20s%10d%10d%10d", place, teamName, scoredFor,
                scoredAgainst, score);
    }
}
