public class TestEvent {
  Order order1 = new Order("Vanilla Latte", "Coffee, Vanilla, Milk", 2.50);
  Hazard hazard1 = new Hazard("Fire", "Extinguisher, Hose, 911");

  public void testEventMethod(){
    System.out.println("Make a " + order1.name + "for $" + order1.price + ". Type " + order1.components);
    if (checkComponents() == true){
      System.out.println("Check Order success");
    } else {
      System.out.println("Check Order fail");
    }

    System.out.println("Attain to the " + hazard1.name + "Type " + hazard1.components);
    if (checkComponents() == true){
      System.out.println("Check Hazard success");
    } else {
      System.out.println("Check Hazard fail");
    }
  }
}