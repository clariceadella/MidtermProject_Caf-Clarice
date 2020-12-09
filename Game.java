public class Game {

  //Event.checkComponents();

  public Game(){

    Player p1 = new Player();

    Order order1 = new Order("Vanilla Latte", "coffee vanilla milk", 2.50);
    Order order2 = new Order("Caramel Latte", "coffee caramel milk", 2.75);
    Order order3 = new Order("Strawberry Lemonade", "strawberry lemon ice", 2.50);
    Order order4 = new Order("Oreo Milkshake", "cookie vanilla milk", 3.50);
    Order order5 = new Order("Rasberry Iced Tea", "rasberry tea sugar", 2.50);
    Order order6 = new Order("Toasted White Chocolate Mocha", "coffee milk sprinkles", 4.50);
    Order order7 = new Order("Breakfast Sandwhich", "egg bagel cheese", 5.50);
    Order order8 = new Order("Pancakes", "egg flour butter", 6.50);
    Order order9 = new Order("Chicken and Waffles", "chicken batter syrup", 8.50);
    Order order10 = new Order("Lemon Pepper Wings", "chicken seasoning ranch", 7.25);
    
    recipeArr.add(order1);
    recipeArr.add(order2);
    recipeArr.add(order3);
    recipeArr.add(order4);
    recipeArr.add(order5);
    recipeArr.add(order6);
    recipeArr.add(order7);
    recipeArr.add(order8);
    recipeArr.add(order9);
    recipeArr.add(order10);

    Hazard hazard1 = new Hazard("a Fire", "extinguisher hose 911");
    Hazard hazard2 = new Hazard("Broken Glass", "caution broom band-aid");
    Hazard hazard3 = new Hazard("a Broken Machine ", "screwdriver flashlight wrench");
    Hazard hazard4 = new Hazard("No More Coffee", "beans funnel roast");
    Hazard hazard5 = new Hazard("Someone Not Wearing a Mask", "kick out");
/*
    order1.giveOrder();
    System.out.println("Type: 'coffee vanilla milk'");
    order1.checkInput();

    order2.giveOrder();
    System.out.println("Type: 'coffee caramel milk'");
    order2.checkInput();
   
    hazard1.giveHazard();
    System.out.println("Type: 'extinguisher hose 911'");
    hazard1.checkInput();

    order3.giveOrder();
    System.out.println("Type: 'strawberry lemon ice'");
    order3.checkInput();
*/
    }
  
  }
