import java.util.Optional;

/**
 * this class holds an array of all the colors in picture (in order from L to R, T to B)
 */

public class ColorArray {
    private Integer numOfRows;
    private Integer numOfColumns;
    private String[] colorAr;

    public ColorArray(Integer rows, Integer columns) {
        this.numOfRows = rows;
        this.numOfColumns = columns;
        this.colorAr = new String[rows*columns];
    }

    public String[] getColorArray() {
        return colorAr;
    }

    public void setColorArray(String[] newPattern) {
        this.colorAr = newPattern;
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

    public Optional<String> getElementAtI(Integer i){
        return Optional.ofNullable(colorAr[i]);
    }
}
