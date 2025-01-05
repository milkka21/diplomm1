package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest {
    private final String bunName;
    private final float bunPrice;

    public BunTest(String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getBun() {
        return new Object[][] {
                {"Булочка из слез крокодила", 934},
                { "Булочка для рыжих котиков", 1000}
        };
    }

    @Test
    public void getBunNameAndPrice() {
        Bun bun = new Bun(bunName, bunPrice);
        Assert.assertEquals("Имя булочки не совпадает", bunName, bun.getName());
        Assert.assertEquals("Цена булочки не совпадает", bunPrice, bun.getPrice(), 0.001);
        Assert.assertTrue("Цена булочки не может быть отрицательной", bunPrice >= 0);
        Assert.assertFalse("Имя булочки не должно быть пустым", bunName.trim().isEmpty());
    }
}
