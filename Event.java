import java.util.Scanner;

public class Event{
  String eventName;
  String components;
  String userComponents;

  public boolean checkComponents(){
    Scanner userInput = new Scanner(System.in);
    userComponents = userInput.nextLine();
    if (userComponents.equals(components)){
      return true;
    }
    else {
      return false;
    }
  }
}

class Order extends Event {
  double price;
  public Order(String nameAssignment, String componentsAssignment, double priceAssignment) {
    eventName = nameAssignment;
    components = componentsAssignment;
    price = priceAssignment;
  }
}

class Hazard extends Event {

  public Hazard(String name, String componentsAssignment) {
    eventName = nameAssignment;
    components = componentsAssignment;
  }

}

