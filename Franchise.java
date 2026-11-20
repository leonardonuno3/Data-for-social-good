public class Franchise {

  // Instance variables
  private String teamName;
  private int wins;
  private int losses;
  private int worldSeriesTitles;
  private double winningPercentage;

  // No-argument constructor
  public Franchise() {
    teamName = "";
    wins = 0;
    losses = 0;
    worldSeriesTitles = 0;
    winningPercentage = 0.0;
  }

  // Constructor with parameters
  public Franchise(String teamName, int wins, int losses,
                   int worldSeriesTitles, double winningPercentage) {
    this.teamName = teamName;
    this.wins = wins;
    this.losses = losses;
    this.worldSeriesTitles = worldSeriesTitles;
    this.winningPercentage = winningPercentage;
  }

  // Getter methods
  public String getTeamName() {
    return teamName;
  }

  public int getWins() {
    return wins;
  }

  public int getLosses() {
    return losses;
  }

  public int getWorldSeriesTitles() {
    return worldSeriesTitles;
  }

  public double getWinningPercentage() {
    return winningPercentage;
  }

  // Returns information about the franchise
  public String toString() {
    return "Team: " + teamName
        + "\nWins: " + wins
        + "\nLosses: " + losses
        + "\nWorld Series Titles: " + worldSeriesTitles
        + "\nWinning Percentage: " + winningPercentage;
  }
}
