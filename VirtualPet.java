import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      String petName = " ";
      
      System.out.println("| ------------------------------------ |");
      System.out.println("|   Welcome to Virtual Pet Simulator!  |");
      System.out.println("| ------------------------------------ |");
      
      System.out.print("\nName your pet: ");
      petName = input.nextLine();
      
      System.out.println("\n" + petName + " Is a nice pet name!");

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {
         // TODO 2:
         // Display happiness, hunger, and energy.
         System.out.println("\nHappiness: " + happiness + "\n" + "Hunger: " + hunger + "\n" + "Energy: " + energy);
         
         System.out.println("\nWhat would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         System.out.print("Choice: ");
         choice = input.nextInt();
         
         if (choice == 1) {
            happiness += 1;
            hunger -= 3;
            energy += 0;
            
         } 
         else if (choice == 2) {
            happiness += 3;
            hunger += 2;
            energy -= 2;
         }
         else if (choice == 3) {
            happiness -= 1;
            hunger += 1;
            energy += 3;
         } 
         else if (choice == 4) {
            happiness += 2;
            hunger += 1;
            energy -= 1;
         }
         else if (choice == 5) {
            System.out.println("\nYou choose to end the game");
         }
         else {
            System.out.println("Invalid choice");
         }
            
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.

      }
      
      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      input.close();
   }
}