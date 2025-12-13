import java.util.Scanner;
import java.util.ArrayList;

/**
 * This is the driver class
 *
 * @author (Chenyu & Varshiha)
 * @version (Elon Musk)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook book = new RecipeBook("My Recipes", "Gigachad");
        book.addRecipe(DefaultRecipes.tomatoSoup());
        book.addRecipe(DefaultRecipes.poutine());
        book.addRecipe(DefaultRecipes.chocolateCake());
        book.addRecipe(DefaultRecipes.iceCream());
        book.addRecipe(DefaultRecipes.creamyGarlicPasta());

        RecipeAdder adder = new RecipeAdder(book);
        boolean running = true;
        while(running){
            System.out.println("\n=== Welcome to GigaMan's Recipe Book Creator! ===");
            System.out.println("1. Add A Recipe");
            System.out.println("2. List All Recipes");
            System.out.println("3. List All Hot Recipes");
            System.out.println("4. List All Cold Recipes");
            System.out.println("5. Remove A Recipe");
            System.out.println("6. List Top-Rated Recipes");
            System.out.println("7. Scale A Recipe");
            System.out.println("8. Print Recipe Book Details");
            System.out.println("9. Exit");
            System.out.println("Enter a choice (1-9)");
            String choice = scanner.nextLine();

            switch(choice){
                case "1" :
                    adder.createAndAddRecipe();
                    System.out.println("Thank you for your contribution to the RecipeBook! Your Recipe was successfully added!");
                    break;

                case "2" :
                    System.out.println("=== All Recipes ===");
                    book.listAllRecipes();
                    break;

                case "3" :
                    ArrayList<Recipe> hotList = book.listHotRecipes();
                    System.out.println("=== Hot Recipes ===");
                    for(Recipe r : hotList){
                        System.out.println("- " + r.getTitle());
                    }
                    break;

                case "4" :
                    ArrayList<Recipe> coldList = book.listColdRecipes();
                    System.out.println("=== Cold Recipes ===");
                    for(Recipe r : coldList){
                        System.out.println("- " + r.getTitle());
                    }
                    break;

                case "5" :
                    System.out.println("Enter the recipe title that you want to remove");
                    String titleToRemove = scanner.nextLine();
                    book.removeRecipe(titleToRemove);
                    break;

                case "6" :
                    ArrayList<Recipe> topRated = book.listTopRated();
                    System.out.println("=== Top Rated Recipes ===");
                    if(topRated.isEmpty()){
                        System.out.println("No recipes with 5 stars");
                    }else{
                        for(Recipe r : topRated){
                            System.out.println("- " + r.getTitle());
                        }
                    }
                    break;

                case "7":
                    System.out.println("Enter recipe title to scale: ");
                    String titleToScale = scanner.nextLine();
                    Recipe r = book.findByExactTitle(titleToScale);
                    if(r == null){
                        System.out.println("Recipe not found.");
                    }else{
                        System.out.println("Enter new number of servings: ");
                        double newServings = scanner.nextDouble();
                        scanner.nextLine();
                        if(newServings <= 0){
                            System.out.println("Servings must be greater than 0.");
                            break;
                        }
                        r.scale(newServings);
                        System.out.println("Recipe was scaled successfully.");
                        r.printDetails();

                    }
                    break;

                case"8":
                    System.out.println("Enter the recipe title that you want to view");
                    String title = scanner.nextLine();
                    book.printRecipeDetails(title);
                    break;

                case"9":
                    running = false;
                    System.out.println("Thank you! I hope your belly is full. Goodbye");
                    break;

                default:
                    System.out.println("Invalid choice...Try again");
            }
        }
    }
}