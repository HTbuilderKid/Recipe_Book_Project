import java.util.Scanner;

/**
 * Automatically creates a recipe and adds it to a RecipeBook.
 */
public class RecipeAdder
{
    private Scanner scanner;
    private RecipeBook book;

    /**
     * Constructor links this RecipeAdder to a specific RecipeBook.
     */
    public RecipeAdder(RecipeBook book)
    {
        this.book = book;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Creates a new recipe and adds it directly to the RecipeBook.
     */
    public void createAndAddRecipe() {
        Recipe recipe = createRecipe();  
        book.addRecipe(recipe);          
        System.out.println("Thank you for your contribution to the RecipeBook! Your Recipe was successfully added!");
    }

    /**
     * Builds and returns a new Recipe object (unchanged from your logic).
     */
    private Recipe createRecipe() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter servings: ");
        int servings = Integer.parseInt(scanner.nextLine());

        System.out.print("Type (hot/cold): ");
        String type = scanner.nextLine().toLowerCase();

        Recipe recipe;
        if (type.equals("hot")) {
            recipe = new RecipeHot(title, servings);
        } else {
            recipe = new RecipeCold(title, servings);
        }

        System.out.print("How many ingredients does the recipe have? ");
        int countIng = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countIng; i++) {
            System.out.print("Ingredient name: ");
            String name = scanner.nextLine();

            System.out.print("Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.print("Unit (G, KG, ML, L, TSP, TBSP, CUP): ");
            Unit unit = Unit.valueOf(scanner.nextLine().toUpperCase());
            recipe.addIngredient(new Ingredient(name, amount, unit));
        }

        System.out.print("How many steps does it take to make your recipe? ");
        int countSteps = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countSteps; i++) {
            System.out.print("Step description: ");
            String text = scanner.nextLine();
            recipe.addStep(new Step(i + 1, text));
        }

        System.out.print("How many tags does your recipe have? ");
        int countTags = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countTags; i++) {
            System.out.print("Tag (VEGAN, VEGETARIAN, MEDITERRANEAN, LOW_CARB, NO_SUGAR, KETO, PALEO): ");
            Tag tag = Tag.valueOf(scanner.nextLine().toUpperCase());
            recipe.addTag(tag);
        }

        return recipe;
    }
}