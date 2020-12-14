import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PatternTest {
    String[] colors;
    ColorArray blueRed;
    Pattern pattern;

    @Before
    public void setup(){
        colors = new String[] {"blue", null, "blue", "red", "blue", null};
        blueRed = new ColorArray(3, 2);
        blueRed.setColorArray(colors);

        pattern = new Pattern(blueRed);
    }

    @Test
    public void constructorTest(){
        Assert.assertNotNull(pattern);
    }

    @Test
    public void getCrossStitchMapTest(){
        Assert.assertNotNull(pattern.getCrossStitchMap());
    }

    @Test
    public void getNumOfRowsTest(){
        Integer expected = 3;
        Integer actual = pattern.getNumOfRows();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumOfRowsTest(){
        Integer expected = 10;
        pattern.setNumOfRows(expected);
        Integer actual = pattern.getNumOfRows();
        Assert.assertEquals(expected, actual);

        pattern.setNumOfRows(3);
    }

    @Test
    public void getNumOfColumnsTest(){
        Integer expected = 2;
        Integer actual = pattern.getNumOfColumns();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumOfColumnsTest(){
        Integer expected = 10;
        pattern.setNumOfColumns(expected);
        Integer actual = pattern.getNumOfColumns();
        Assert.assertEquals(expected, actual);

        pattern.setNumOfColumns(2);
    }

    @Test
    public void changeSquareTest(){
        String expected = "green";
        pattern.changeSquare(2, 1, expected);
        String actual = pattern.getSquareColor(2, 1);
        Assert.assertEquals(expected, actual);

        pattern.changeSquare(2, 1, "blue");
    }

    @Test
    public void createLocationKeysTest(){}

    @Test
    public void getElementAtITest(){
        String expected = "[empty]";
        String actual = pattern.getElementAtI(1).orElse("[empty]");
        Assert.assertEquals(expected, actual);

        String expected2 = "blue";
        String actual2 = pattern.getElementAtI(0).orElse("[empty]");
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void addAllToMapTest(){}

    @Test
    public void getTotalOfColorTest(){
        Integer expected = 3;
        Integer actual = pattern.getTotalOfColor("blue");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeAllOfOneColorTest(){
        //NOT PASSING
        String expected = "pink";
        pattern.changeAllOfOneColor("blue", expected);
        String actual = pattern.getSquareColor(1,1);
        Assert.assertEquals(expected, actual);

        pattern.changeAllOfOneColor("pink", "blue");
    }

    @Test
    public void getSquareColorTest1(){
        String expected = "red";
        String actual = pattern.getSquareColor(2, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSquareColorTest2(){
        String expected = "blue";
        String actual = pattern.getSquareColor(1, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printMeTest(){
        String expected = "|   blue    |  [empty]  |\n" +
                "|   blue    |    red    |\n" +
                "|   blue    |  [empty]  |\n";
        String actual = pattern.printMe();
        Assert.assertEquals(expected, actual);
    }
}
