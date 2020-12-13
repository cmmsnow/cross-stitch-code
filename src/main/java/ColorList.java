import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * need this class to hold a list or array that is just full of colors
 */

public class ColorList {
    private Integer numOfRows;
    private Integer numOfColumns;
    private ArrayList<String> colorList;

    public ColorList() {
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
        this.colorList = new ArrayList<>();
    }

    public ArrayList<String> getPattern() {
        return colorList;
    }

    public void setPattern(ArrayList<String> newPattern) {
        this.colorList = newPattern;
    }

    public void addAll(ArrayList<String> newPattern){
        colorList.clear();
        colorList.addAll(newPattern);
    }
}
