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

      //TODO 1
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {
         //TODO 2
         System.out.println("\n-----------------");
         System.out.println("   Happiness: " + happiness + 
                            "\n   Hunger: " + hunger + 
                            "\n   Energy: " + energy);
         System.out.println("-----------------");
         
         System.out.println("\nWhat would you like to do?\n1. Feed\n2. Play\n3. Sleep\n4. Bath\n5. Quit");
         
         System.out.print("Choice: ");
         choice = input.nextInt();
         //TODO 3
         if (choice == 1) {
            happiness += 1;
            hunger -= 3;
            energy += 0;
            System.out.println("\n" + petName + " liked the food!");
            
         } 
         else if (choice == 2) {
            happiness += 3;
            hunger += 2;
            energy -= 2;
            System.out.println("\n" + petName + " liked the game, but got hungry and tired.");
         }
         else if (choice == 3) {
            happiness -= 1;
            hunger += 1;
            energy += 3;
            System.out.println("\n" + petName + " had a dream about its favorite food.");
         } 
         else if (choice == 4) {
            happiness += 2;
            hunger += 1;
            energy -= 1;
            System.out.println("\nWho never got hungry and tired after a shower");
         }
         else if (choice == 5) {
            System.out.println("\nYou choose to end the game");
         }
         else if (choice == -1) {
            System.out.println("\n| ---------------------------------------- |");
            System.out.println("|   Welcome to NOT Virtual Pet Simulator!  |");
            System.out.println("| ---------------------------------------- |");
            int notchoice = 0;
               while (notchoice != -1) {
                  System.out.print("Choice: ");
                  notchoice = input.nextInt();
               }
         }
         else {
            System.out.println("\n[Invalid choice]");
         }
      }
      //TODO 4
      if (happiness >= 15 && hunger >= 10 && energy <= 0) {
         System.out.println(petName + " is very happy, but died with no food and energy. You Lost!");
      }
      else if (happiness >= 15) {
         System.out.println(petName + " is now very happy. You Won!");
      }
      else if (hunger >= 10) {
         System.out.println(petName + " died with no food. You Lost!");
      }
      else if (energy <= 0) {
         System.out.println(petName + " got very tired. You Lost!");
      }

      input.close();
   }
}

//TODOs
// TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
// TODO 2:
      // Display happiness, hunger, and energy.
// TODO 3:
      // Create an if / else if / else statement
      // to handle the player's choice.
      // Update the three statistics according
      // to the table in the instructions.
      // Print a funny message for each action.
// TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.