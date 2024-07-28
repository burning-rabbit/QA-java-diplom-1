import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {
    IngredientType ingredientType = IngredientType.SAUCE;
    IngredientType ingredientType1 = IngredientType.FILLING;

    @Test
    public void testSAUCE(){
        Assert.assertEquals(ingredientType, IngredientType.SAUCE);
    }

    @Test
    public void testFILLING(){
        Assert.assertEquals(ingredientType1, IngredientType.FILLING);
    }
}
