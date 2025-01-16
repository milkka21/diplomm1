package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final IngredientType ingredientType;
    private final String ingredientName;
    private final float ingredientPrice;

    public IngredientTest(IngredientType ingredientType, String ingredientName, float ingredientPrice) {
        this.ingredientType = ingredientType;
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                { IngredientType.FILLING, "Плоды Ниагарового водопада", 788},
                { IngredientType.SAUCE, "Наслаждение", 564},
                { IngredientType.FILLING, "Драгон фрут", 7932},
                { IngredientType.SAUCE, "Огненное дыхание", 398},
        };
    }

    @Test
    public void ingredient() {
        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        Assert.assertEquals(ingredientType, ingredient.getType());
        Assert.assertEquals(ingredientName, ingredient.getName());
        Assert.assertEquals(ingredientPrice, ingredient.getPrice(), 0.001);
    }
}
