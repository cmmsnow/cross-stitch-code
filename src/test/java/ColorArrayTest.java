import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Optional;

/**
 * unhappy with optionals at getRows and getColumns
 */

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
    public void constructorTest(){
        Assert.assertNotNull(blueRed);
    }

    @Test
    public void getColorArrayTest(){
        String[] actual = blueRed.getColorArray();
        Assert.assertEquals(pattern, actual);
    }

    @Test
    public void setColorListTest(){}

    @Test
    public void addAllTest(){}

    @Test
    public void getRowsTest(){
        Integer actual = blueRed.getNumOfRows();
        //Assert.assertEquals(3, actual);
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
        Integer actual = blueRed.getNumOfColumns();
        //Assert.assertEquals(2, actual);
    }

    @Test
    public void setColumnsTest(){
        Integer given = 30;
        blueRed.setNumOfColumns(given);
        Integer actual = blueRed.getNumOfColumns();
        Assert.assertEquals(given, actual);

        blueRed.setNumOfColumns(2);
    }
}
