
/**
 * Write a description of class DefaultRecipes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultRecipes
{
    public static Recipe tomatoSoup(){
        RecipeHot hot1 = new RecipeHot("Tomato Soup", 8, 25);

        hot1.addIngredient(new Ingredient("fUnsalted fbutter", 3, Unit.TBSP));
        hot1.addIngredient(new Ingredient("Yellow onions", 2, Unit.UNIT));
        hot1.addIngredient(new Ingredient("Garlic cloves", 3, Unit.UNIT));
        hot1.addIngredient(new Ingredient("Crushed tomatoes", 56, Unit.OZ));
        hot1.addIngredient(new Ingredient("Chicken stock", 2, Unit.CUP));
        hot1.addIngredient(new Ingredient("Fresh basil", 0.25, Unit.CUP));
        hot1.addIngredient(new Ingredient("Sugar", 1, Unit.TBSP));
        hot1.addIngredient(new Ingredient("Black pepper", 0.5, Unit.TSP));
        hot1.addIngredient(new Ingredient("Heavy whipping cream", 0.5, Unit.CUP));
        hot1.addIngredient(new Ingredient("Parmesan cheese", 0.3, Unit.CUP));

        hot1.addStep(new Step(1, "Add butter and chopped onions. Sauté 10-12 minutes and add minced garlic"));
        hot1.addStep(new Step(2, "Add and stir crushed tomato with the juice, chicken stock, chopped basil, sugar, and black pepper. Bring to a boil and let simmer for 10 minutes" ));
        hot1.addStep(new Step(3, "Add heavy cream and cheese and return to a simmer"));
        hot1.addStep(new Step(4, "Pour into bowls and top with more parmesan and chopped basil"));

        hot1.addRating(new Rating(4, "Very yummy!"));
        hot1.addRating(new Rating(2, "I don't like tomatoes"));
        hot1.addRating(new Rating(4, "I love ketchup"));

        hot1.addTag(Tag.MEDITERRANEAN);
        return hot1;
    }

    public static Recipe poutine(){
        RecipeHot  hot2 = new RecipeHot("Poutine", 5, 20);

        hot2.addIngredient(new Ingredient("Unsalted butter", 0.25, Unit.CUP));
        hot2.addIngredient(new Ingredient("All-purpose flour", 0.25, Unit.CUP));
        hot2.addIngredient(new Ingredient("Store-bought beef stock", 2, Unit.CUP));
        hot2.addIngredient(new Ingredient("Store-bought or homemade chicken stock", 1, Unit.CUP));
        hot2.addIngredient(new Ingredient("Asian fish sauce", 2, Unit.TSP));
        hot2.addIngredient(new Ingredient("Soy sauce", 2, Unit.TSP));
        hot2.addIngredient(new Ingredient("Rice vinegar", 1.5, Unit.TBSP));
        hot2.addIngredient(new Ingredient("Kosher salt", 0.125, Unit.TSP));
        hot2.addIngredient(new Ingredient("Thick-cut French fries", 0.9, Unit.KG));
        hot2.addIngredient(new Ingredient("White cheddar cheese curds", 12, Unit.OZ));

        hot2.addStep(new Step(1, "Melt butter in a saucepan on medium-high heat"));
        hot2.addStep(new Step(2, "Whisk in flour for about 2 minutes"));
        hot2.addStep(new Step(3, "Whisk in beef and chicken stock"));
        hot2.addStep(new Step(4, "Stir in fish sauce and soy sauce"));
        hot2.addStep(new Step(5, "Bring to a boil and return to a simmer for 10-15 minutes"));
        hot2.addStep(new Step(6, "Add fries, sauce and cheese curds in a bowl"));

        hot2.addRating(new Rating(5, "Wow! So CANADIAN"));
        hot2.addRating(new Rating(5, "Canadien food sucks"));

        hot2.addTag(Tag.LOW_CARB);
        return hot2;

    }

    public static Recipe chocolateCake(){
        RecipeCold cold1 = new RecipeCold("Chocolate Cake", 24, 10);

        cold1.addIngredient(new Ingredient("White sugar", 2, Unit.CUP));
        cold1.addIngredient(new Ingredient("All-purpose flour", 1.75, Unit.CUP));
        cold1.addIngredient(new Ingredient("Unsweetened coca powder", 0.75, Unit.CUP));
        cold1.addIngredient(new Ingredient("Baking powder", 1.5, Unit.TSP));
        cold1.addIngredient(new Ingredient("Baking soda", 1.5, Unit.TSP));
        cold1.addIngredient(new Ingredient("Salt", 1, Unit.TSP));
        cold1.addIngredient(new Ingredient("Eggs", 2, Unit.UNIT));
        cold1.addIngredient(new Ingredient("Milk", 1, Unit.CUP));
        cold1.addIngredient(new Ingredient("Vegetable oil", 0.5, Unit.CUP));
        cold1.addIngredient(new Ingredient("Vanilla extract", 2, Unit.TSP));
        cold1.addIngredient(new Ingredient("Boiling water", 1, Unit.CUP));

        cold1.addStep(new Step(1, "Preheat oven to 350 degrees F"));
        cold1.addStep(new Step(2, "Stir sugar, flour, cocoa, baking powder, baking soda, and salt"));
        cold1.addStep(new Step(3, "Add eggs, milk, oil, and vanilla and mix together"));
        cold1.addStep(new Step(4, "Stir in the boiling water"));
        cold1.addStep(new Step(5, "Grease two baking pans and pour batter evenly into the pans"));
        cold1.addStep(new Step(6, "Bake for 33 minutes"));
        cold1.addStep(new Step(7, "Add frosting and sprinkles(optional)"));
        cold1.addStep(new Step(8, "Cool in the refrigerator for 10 minutes"));

        cold1.addRating(new Rating(5, "CHOCOLATEEEE SO GOOODDD"));

        cold1.addTag(Tag.VEGETARIAN);

        return cold1;
    }

    public static Recipe iceCream(){
        RecipeCold cold2 = new RecipeCold("Vanilla Ice Cream", 6, 60);

        cold2.addIngredient(new Ingredient("Heavy cream", 1.75, Unit.CUP));
        cold2.addIngredient(new Ingredient("Whole milk", 1.25, Unit.CUP));
        cold2.addIngredient(new Ingredient("Sugar", 0.75, Unit.CUP));
        cold2.addIngredient(new Ingredient("Fine sea salt", 0.125, Unit.TSP));
        cold2.addIngredient(new Ingredient("Vanilla extract", 1, Unit.TBSP));

        cold2.addStep(new Step(1, "Pour 1 cup of cream into a saucepan"));
        cold2.addStep(new Step(2, "Warm the mixture over medium heat, just until the sugra dissolves."));
        cold2.addStep(new Step(3, "Whisk to combine and chill in the refrigerator"));
        cold2.addStep(new Step(4, "When ready to churn, whisk the mixture again and pour it into the ice cream maker"));
        cold2.addStep(new Step(5, "Serve immediately"));
        cold2.addStep(new Step(6, "Place the rest in the freezer"));

        cold2.addRating(new Rating(5, "I scream. We scream. We scream for ice cream! SO GOOODDD"));
        cold2.addRating(new Rating(1, "Chocolate is better"));
        cold2.addRating(new Rating(4, "Not bad for homemade ice cream"));
        cold2.addRating(new Rating(3, "Not bad, but not good"));

        cold2.addTag(Tag.VEGETARIAN);
        
        return cold2;
    }
    
    public static Recipe creamyGarlicPasta(){
        RecipeHot hot3 = new RecipeHot("Creamy Garlic Pasta", 4, 20);
        
        hot3.addIngredient(new Ingredient("Olve oil", 2, Unit.TSP));
        hot3.addIngredient(new Ingredient("Minced garlic cloves", 4, Unit.UNIT));
        hot3.addIngredient(new Ingredient("Butter", 2, Unit.TBSP));
        hot3.addIngredient(new Ingredient("Chicken broth", 3, Unit.CUP));
        hot3.addIngredient(new Ingredient("Ground black pepper", 0.5, Unit.TSP));
        hot3.addIngredient(new Ingredient("Salt", 0.25, Unit.TSP));
        hot3.addIngredient(new Ingredient("Spaghetti", 0.5, Unit.POUND));
        hot3.addIngredient(new Ingredient("Grated mozarella", 1, Unit.CUP));
        hot3.addIngredient(new Ingredient("Heavy cream", 0.75, Unit.CUP));
        hot3.addIngredient(new Ingredient("Dried parsley", 1.5, Unit.TBSP));
        
        hot3.addStep(new Step(1, "Gather all ingredients"));
        hot3.addStep(new Step(2, "Heat olive oil in a medium pan over medium heat"));
        hot3.addStep(new Step(3, "Add garlic and stir for 1-2 minutes"));
        hot3.addStep(new Step(4, "Add butter and stir until melted"));
        hot3.addStep(new Step(5, "Pour in chicken brothe"));
        hot3.addStep(new Step(6, "Add pepper and salt"));
        hot3.addStep(new Step(7, "Bring to a boil"));
        hot3.addStep(new Step(8, "Add spaghetti and cook"));
        hot3.addStep(new Step(9, "Add more chicken brothe if pasta starts to stick to the pan"));
        hot3.addStep(new Step(10, "Add and mix cheese, cream and parsley"));
        hot3.addStep(new Step(11, "Enjoy"));
        
        hot3.addRating(new Rating(2, "Toooo much garlic"));
        hot3.addRating(new Rating(1, "Dracula Run"));
        hot3.addRating(new Rating(2, "My breath sticks like straight up garlic"));
        hot3.addRating(new Rating(1, "Chill on the garlic"));
        
        hot3.addTag(Tag.VEGETARIAN);
        
        return hot3;
    }
}