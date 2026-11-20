public class UserStory {

  private Franchise[] franchises;

  // Loads the data
  public UserStory() {

    String[] names = FileReader.toStringArray("franchises.txt");
    int[] wins = FileReader.toIntArray("wins.txt");
    int[] losses = FileReader.toIntArray("losses.txt");
    int[] titles = FileReader.toIntArray("worldSeriesTitles.txt");
    double[] percentages = FileReader.toDoubleArray("winningPercentages.txt");

    franchises = new Franchise[names.length];

    for (int i = 0; i < names.length; i++) {
      franchises[i] = new Franchise(names[i], wins[i],
          losses[i], titles[i], percentages[i]);
    }
  }

  // Finds a team by name
  public Franchise findFranchise(String name) {

    for (int i = 0; i < franchises.length; i++) {

      if (franchises[i].getTeamName().equalsIgnoreCase(name)) {
        return franchises[i];
      }
    }

    return null;
  }

  // Finds the team with the most championships
  public Franchise getMostWorldSeriesTitles() {

    Franchise best = franchises[0];

    for (int i = 1; i < franchises.length; i++) {

      if (franchises[i].getWorldSeriesTitles()
          > best.getWorldSeriesTitles()) {
        best = franchises[i];
      }
    }

    return best;
  }

  // Finds the team with the best winning percentage
  public Franchise getBestWinningPercentage() {

    Franchise best = franchises[0];

    for (int i = 1; i < franchises.length; i++) {

      if (franchises[i].getWinningPercentage()
          > best.getWinningPercentage()) {
        best = franchises[i];
      }
    }

    return best;
  }

  // Displays all the teams
  public String getAllFranchises() {

    String result = "";

    for (int i = 0; i < franchises.length; i++) {
      result += franchises[i].toString() + "\n";
    }

    return result;
  }

  // Returns information about the dataset
  public String toString() {
    return "MLB Franchise Analyzer\n"
        + "Total Teams: " + franchises.length;
  }
}
