import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (Chenyu)
 * @version (Elon Musk)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook book = new RecipeBook("My Recipes", "Gigachad");
        RecipeAdder adder = new RecipeAdder(book);

        boolean running = true;
        while(running){
            System.out.println("=== Welcome to GigaMan's Recipe Book Creator! ===");
            System.out.println("1. Add A Recipe");
            System.out.println("2. List All Recipes");
            System.out.println("3. Print Recipe Book Details");
            System.out.println("4. Exit");
            System.out.println("Enter a choice (1-4)");
            String choice = scanner.nextLine();
            
            switch(choice){
                case "1" :
                    adder.createAndAddRecipe();
                    System.out.println("\n=== Your Recipe has been added! ===");
                    break;
                case "2" :
                    book.listAllRecipes();
                    break;
                case "3" :
                    System.out.println("Enter the recipe title that you want to view");
                    String title = scanner.nextLine();
                    book.printRecipeDetails(title);
                case "4":
                    System.out.println("Thank you! Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice...Try again");
            }
        }
    }
}