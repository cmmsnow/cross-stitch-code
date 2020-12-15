import java.util.ArrayList;
import java.util.List;

/**
 * holds all pattern hashmaps
 */

public class AllPatterns {
    private List<Pattern> allPatterns;

    public AllPatterns(){ this.allPatterns = new ArrayList<>(); }

    public void addPattern(Pattern pattern){
        allPatterns.add(pattern);
    }

    public List<Pattern> getPatterns(){
        return this.allPatterns;
    }

    public Integer getNumberOfPatterns(){
        return allPatterns.size();
    }

    public static void main(String[] args){
        AllPatterns allPatterns = new AllPatterns();

        //1) create color array -- ideally swap to using database colors
        String red = "DMC_606";
        String orange = "DMC_741";
        String lemon = "DMC_307";
        String liteLemon = "DMC_445";
        String liteGreen = "DMC_912";
        String green = "DMC_3818";
        String dark = "DMC_939";
        String[] colors = new String[] {null, null, null, null, null, null, red, null, null, null, null, null, null, red, null, null, null, null, null, null, null,
        null, null, null, null, null, red, red, null, null, red, null, null, red, red, null, null, null, null, red, null, null,
        null, null, null, null, null, red, null, null, red, red, null, red, red, null, null, null, null, red, red, null, null,
        null, null, null, null, red, red, red, null, orange, red, null, orange, red, null, null, red, orange, red, null, null, null,
        null, null, null, null, red, orange, red, null, orange, orange, null, orange, red, null, null, orange, red, red, red, null, null,
        null, null, null, red, orange, orange, orange, red, lemon, orange, orange, lemon, orange, red, null, orange, orange, red, null, null, null, 
        null, null, red, orange, orange, lemon, orange, orange, lemon, orange, lemon, orange, lemon, orange, red, lemon, orange, orange, red, null, null,
        null, null, red, orange, orange, lemon, orange, lemon, orange, lemon, orange, orange, lemon, lemon, orange, lemon, lemon, orange, red, null, null,
        null, null, lemon, lemon, lemon, orange, liteLemon, liteLemon, orange, liteLemon, orange, lemon, lemon, orange, lemon, orange, lemon, orange, orange, null, null,
        null, null, green, lemon, orange, liteLemon, liteLemon, liteLemon, lemon, lemon, lemon, liteLemon, orange, lemon, liteLemon, orange, orange, lemon, green, null, null,
        null, green, liteLemon, liteLemon, liteLemon, liteLemon, liteLemon, lemon, lemon, liteLemon, liteLemon, liteLemon, liteLemon, lemon, lemon, orange, liteLemon, lemon, lemon, green, null,
        null, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, null,
        null, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, null,
        null, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, null,
        liteGreen, liteGreen, liteGreen, dark, dark, dark, liteGreen, dark, dark, dark, liteGreen, dark, dark, dark, liteGreen, dark, dark, dark, liteGreen, liteGreen, liteGreen,
        liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, liteGreen,
        liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, liteGreen,
        liteGreen, liteGreen, liteGreen, liteGreen, dark, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, dark, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, liteGreen,
        null, liteGreen, liteGreen, dark, dark, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, dark, dark, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, null,
        null, liteGreen, liteGreen, dark, liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, null,
        null, liteGreen, liteGreen, dark, liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, liteGreen, dark, liteGreen, dark, liteGreen, liteGreen, null,
        null, liteGreen, liteGreen, dark, dark, dark, liteGreen, dark, dark, dark, liteGreen, dark, dark, dark, liteGreen, dark, dark, dark, liteGreen, liteGreen, null,
        null, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, liteGreen, null,
                null, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, green, null,
                null, null, dark, dark, null, null, null, null, null, null, null, null, null, null, null, null, null, dark, dark, null, null};

        ColorArray colorArrayDumpster = new ColorArray(25, 21);
        colorArrayDumpster.setColorArray(colors);

        //2) create pattern
        Pattern dumpsterFire = new Pattern(colorArrayDumpster);

        //3) add pattern to list
        allPatterns.addPattern(dumpsterFire);

        //4) print pattern
        dumpsterFire.printMe();
    }
}
