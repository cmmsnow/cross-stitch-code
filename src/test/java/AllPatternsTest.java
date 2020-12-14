import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AllPatternsTest {
    String[] colors1;
    String[] colors2;
    ColorArray blueRed;
    ColorArray pinkPurple;
    Pattern pattern1;
    Pattern pattern2;
    AllPatterns allPatterns;

    @Before
    public void setup(){
        colors1 = new String[] {"blue", null, "blue", "red", "blue", null};
        blueRed = new ColorArray(3, 2);
        blueRed.setColorArray(colors1);
        pattern1 = new Pattern(blueRed);

        colors2 = new String[] {"pink", null, "pink", "pink", "purple", "black", "purple", null, "pink"};
        pinkPurple = new ColorArray(3, 3);
        pinkPurple.setColorArray(colors2);
        pattern2 = new Pattern(pinkPurple);

        allPatterns = new AllPatterns();
        allPatterns.addPattern(pattern1);
    }

    @Test
    public void constructorTest1(){
        Assert.assertNotNull(allPatterns);
    }

    @Test
    public void constructorTest2(){
        Integer expected = 1;
        Integer actual = allPatterns.getNumberOfPatterns();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPatternTest(){
        Integer expected = allPatterns.getNumberOfPatterns() + 1;
        allPatterns.addPattern(pattern2);
        Integer actual = allPatterns.getNumberOfPatterns();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPatternsTest(){
        ArrayList<Pattern> expected = new ArrayList<>();
        expected.add(pattern1);
        expected.add(pattern2);
        Assert.assertEquals(expected.get(0), allPatterns.getPatterns().get(0));
    }
}
