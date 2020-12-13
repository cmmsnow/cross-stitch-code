import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * need this class to hold a list or array that is just full of colors (in order from L to R, T to B)
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

    public ArrayList<String> getColorList() {
        return colorList;
    }

    public void setColorList(ArrayList<String> newPattern) {
        this.colorList = newPattern;
    }

    public void addAll(ArrayList<String> newPattern){
        colorList.clear();
        colorList.addAll(newPattern);
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer numOfRows) {
        this.numOfRows = numOfRows;
    }

    public Integer getNumOfColumns() {
        return numOfColumns;
    }

    public void setNumOfColumns(Integer numOfColumns) {
        this.numOfColumns = numOfColumns;
    }
}
