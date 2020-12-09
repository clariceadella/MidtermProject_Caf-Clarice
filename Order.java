import java.util.ArrayList;

//subclass of Event 
class Order extends Event {
  double price;
  public static double totalProfit = 0;
  public static ArrayList<Order> recipeArr = new ArrayList<Order>();

  //constructor 
  public Order(String nameAssignment, String componentsAssignment, double priceAssignment){
    eventName = nameAssignment;
    components = componentsAssignment;
    price = priceAssignment;
  }

  public void giveOrder() {
   System.out.print("Make a " + eventName + " for $");
   System.out.printf("%.02f\n", price);

  }

  public static void calcEarnings(double pricing){
    totalProfit += pricing;
  }

  public static void constructMenu(){
    
  }

  public static void openRecipe() {
    System.out.println("----- RECIPE BOOK -----");
    for (Order i: recipeArr){
      System.out.println(i.eventName);
    }
  }

  public void OrderCheckInput(){

    while (true) {
      input = userInput.nextLine();
      if (input.equals(components)){
        System.out.println("Correct");
        //method to add price
        break;
      } else if (input.equals("open recipe book")){
        Order.openRecipe();
      } else if (input.equals("Done for today")){
        //insert method
      }
      else {
        System.out.println("Try again");
      }
  
  }

}
}