import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * don't know why it's not acknowledging my setup() method
 */

public class ColorListTest {
    @Before
    public void setup(){
        ArrayList<String> pattern = new ArrayList<>();
        //add dumpsterFire colors to pattern here
        ColorList dumpsterFire = new ColorList(25, 21);
        dumpsterFire.setColorList(pattern);
    }

    @Test
    public void constructorTest(){
//        Assert.assertNotNull(dumpsterFire);
    }

    @Test
    public void getColorListTest(){
//        ArrayList<String> actual = dumpsterFire.getColorList();
//        Assert.assertEquals(pattern, actual);
    }

    @Test
    public void setColorListTest(){}

    @Test
    public void addAllTest(){}

    @Test
    public void getRowsTest(){
//        Integer actual = dumpsterFire.getNumOfRows();
//        Assert.assertEquals(25, actual);
    }

    @Test
    public void setRowsTest(){
//        Integer given = 20;
//        dumpsterFire.setNumOfRows(given);
//        Integer actual = dumpsterFire.getNumOfRows();
//        Assert.assertEquals(given, actual);
//
//        dumpsterFire.setNumOfRows(25);
    }

    @Test
    public void getColumnsTest(){
//        Integer actual = dumpsterFire.getNumOfColumns();
//        Assert.assertEquals(21, actual);
    }

    @Test
    public void setColumnsTest(){
//        Integer given = 30;
//        dumpsterFire.setNumOfColumns(given);
//        Integer actual = dumpsterFire.getNumOfColumns();
//        Assert.assertEquals(given, actual);
//
//        dumpsterFire.setNumOfColumns(21);
    }
}
