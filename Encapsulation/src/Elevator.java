public class Elevator {
   int currentFloor = 1;
   int minFloor;
   int maxFloor;

   public Elevator(int minfloor, int maxfloor){
      minFloor = minfloor;
      maxFloor = maxfloor;
   }

   public int getCurrentFloor() {
      return currentFloor;
   }

   public int moveDown(){
      currentFloor=currentFloor-1;
      return currentFloor;
   }

   public int moveUp(){
      currentFloor=currentFloor-1;
      return currentFloor;
   }
   public void move(int floor){
      boolean error = false;
      int sumFloor = currentFloor + floor;
      if ((sumFloor)<minFloor || (sumFloor)>maxFloor){
         error = true;
         return;
      }
      if (error) {
         System.out.println("Error meanings :(");
         return;
      }
      while (currentFloor!=floor){
         // floor<currentFloor ? moveDown() : moveUp();
         if (floor<currentFloor){
            moveDown();
         }
         return;
      }

   }
}
