import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ColorArrayTest {
    String[] pattern;
    ColorArray blueRed;

    @Before
    public void setup(){
        pattern = new String[] {"blue", "red", "blue", "red", "blue", "red"};
        blueRed = new ColorArray(3, 2);
        blueRed.setColorArray(pattern);
    }

    @Test
    public void constructorTest1(){
        Assert.assertNotNull(blueRed);
    }

    @Test
    public void constructorTest2(){
        Integer expected = 6;
        Integer actual = pattern.length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest3(){
        String expected = "blue";
        String actual = pattern[0];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest4(){
        String expected = "red";
        String actual = pattern[5];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getColorArrayTest(){
        String[] actual = blueRed.getColorArray();
        Assert.assertEquals(pattern, actual);
    }

    @Test
    public void getRowsTest(){
        Integer expected = 3;
        Integer actual = blueRed.getNumOfRows();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setRowsTest(){
        Integer given = 20;
        blueRed.setNumOfRows(given);
        Integer actual = blueRed.getNumOfRows();
        Assert.assertEquals(given, actual);

        blueRed.setNumOfRows(3);
    }

    @Test
    public void getColumnsTest(){
        Integer expected = 2;
        Integer actual = blueRed.getNumOfColumns();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setColumnsTest(){
        Integer given = 30;
        blueRed.setNumOfColumns(given);
        Integer actual = blueRed.getNumOfColumns();
        Assert.assertEquals(given, actual);

        blueRed.setNumOfColumns(2);
    }

    @Test
    public void getElementAtITest(){
        String[] pattern2 = new String[] {null, "red", "blue", null, "blue", "red"};
        ColorArray withNulls = new ColorArray(3, 2);
        withNulls.setColorArray(pattern2);

        String expected = "[empty]";
        String actual = withNulls.getElementAtI(0).orElse("[empty]");
        Assert.assertEquals(expected, actual);
    }
}
