import java.util.Scanner;

public class Event{
  String eventName;
  String components;
  String userComponents;

  //method to check userInput of components 
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
//subclass of Event 
class Order extends Event {
  double price;
  //constructor 
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

