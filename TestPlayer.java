public class TestPlayer{
  public static void testMethod() {
    System.out.println("This is test. Use the name 'Jane Doe' and '35.00' as the profit goal");
    Player p1 = new Player();
    
    if (p1.playerName.equals("Jane Doe")) {
      System.out.println("Player name success");
    } else {
      System.out.println("Player name fail");
    }

    if (p1.profitGoal == 35.00){
      System.out.println("Profit goal success");
    } else {
      System.out.println("Profit goal fail");
    }
    

  }


}
