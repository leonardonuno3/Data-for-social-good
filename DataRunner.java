public class DataRunner {

  public static void main(String[] args) {

    UserStory User = new UserStory();

    System.out.println(User);

    // Show the team with the most championships
    System.out.println("\n MOST WORLD SERIES CHAMPIONSHIPS");
    System.out.println("------------------------------------");
    System.out.println(User.getMostWorldSeriesTitles());

    // Show the team with the best winning percentage
    System.out.println("\n BEST WINNING PERCENTAGE");
    System.out.println("------------------------------------");
    System.out.println(User.getBestWinningPercentage());

    // Display all MLB franchises
    System.out.println("\n ALL MLB FRANCHISES");
    System.out.println("------------------------------------");
    System.out.println(User.getAllFranchises());

  
  
  }
}
