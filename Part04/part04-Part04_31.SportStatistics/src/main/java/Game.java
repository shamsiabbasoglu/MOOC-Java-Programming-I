public class Game {

    private String homeTeam;
    private String guestTeam;
    private int homeScore;
    private int guestScore;

    public Game(String homeTeam, String guestTeam, int homeScore, int guestScore) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.homeScore = homeScore;
        this.guestScore = guestScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getGuestScore() {
        return guestScore;
    }

    
}
