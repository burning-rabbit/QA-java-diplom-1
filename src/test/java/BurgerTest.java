import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class BurgerTest {

    @Test
    public void testSetBuns(){
        Bun bun = new Bun("Super", Float.valueOf(12));
        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void testAddIngredient(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sitchuanskiy", Float.valueOf(10));
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        Assert.assertEquals(ingredient, burger.ingredients.get(0));
    }

    @Test
    public void testRemoveIngredient(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sitchuanskiy", Float.valueOf(10));
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void testMoveIngredient(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sitchuanskiy", Float.valueOf(10));
        Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "meat", Float.valueOf(100));
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(0,1);
        Assert.assertEquals(burger.ingredients.get(1), ingredient);
    }

    @Test
    public void testGetPrice(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sitchuanskiy", Float.valueOf(10));
        Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "meat", Float.valueOf(100));
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient2);
        Bun bun = new Bun("Super", Float.valueOf(12));
        burger.setBuns(bun);
        Assert.assertEquals(134, burger.getPrice(), 0);
    }

    @Test
    public void testGetReceipt(){
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sitchuanskiy", Float.valueOf(10));
        Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "meat", Float.valueOf(100));
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient2);
        Bun bun = new Bun("Super", Float.valueOf(12));
        burger.setBuns(bun);
        Assert.assertEquals("(==== Super ====)\n" + "= sauce sitchuanskiy =\n"
                + "= filling meat =\n" + "(==== Super ====)\n" +
                "\n" + "Price: 134,000000\n", burger.getReceipt());
    }
}
