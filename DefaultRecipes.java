
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
        hot1.addRating(new Rating(5, "I love ketchup"));
        
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
        hot2.addRating(new Rating(1, "Canadien food sucks"));
        
        hot2.addTag(Tag.LOW_CARB);
        return hot2;
        
    }
}