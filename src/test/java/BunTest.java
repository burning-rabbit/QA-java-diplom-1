import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

    String name = "Super";
    Float price = Float.valueOf(12);

    @Test
    public void testGetName(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void testGetPrice(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}
