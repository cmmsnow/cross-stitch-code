import org.junit.Assert;
import org.junit.Test;

public class ColorTest {
    @Test
    public void constructorTest(){
        String value = "45";
        Color color = new Color(value);
        Assert.assertNotNull(color);
    }

    @Test
    public void getTest(){
        String expected = "45";
        Color color = new Color(expected);
        String actual = color.getColorNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest(){
        Color color = new Color("160");
        String expected = "99";
        color.setColorNumber(expected);
        String actual = color.getColorNumber();
        Assert.assertEquals(expected, actual);
    }
}
