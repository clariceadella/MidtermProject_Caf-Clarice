import java.time.LocalTime;

class Hazard extends Event {
  public Hazard(String nameAssignment, String componentsAssignment) {
    eventName = nameAssignment;
    components = componentsAssignment;
  }
  public void giveHazard() {
   System.out.println("AHH! Quick! There is " + eventName);
   
  }

  public void HazardCheckInput(){
    int startTime;
    int endTime;
    LocalTime start = LocalTime.now();
    startTime = start;
    
    while (true) {
      input = userInput.nextLine();
      if (input.equals(components)){
        System.out.println("Correct");
        LocalTime end = LocalTime.now();
        endTime = end;
        if ((endTime - startTime) <= 10) {
        break;
        } else {
          System.out.println("GAME OVER");
          System.exit(0);
        }
      } else {
        System.out.println("GAME OVER");
        System.exit(0);
      }
  
  }
}
}
