import java.lang.reflect.Array;

/**
 * GOING TO REWRITE/NOT USE ARRAY. Will use hashset or something?
 *
 * constructor - eventually accepts photo source as param?
 */

public class PixelDataStructure {
    private final String[][] pixelArray;
    private Integer numOfRows;
    private Integer numInRow;

    public PixelDataStructure(Integer numOfRows, Integer numInRow) {
        this.numOfRows = numOfRows;
        this.numInRow = numInRow;
        this.pixelArray = new String[numOfRows][numInRow];
    }

    public String[][] getPixelArray() {
        return pixelArray;
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer numOfRows) {
        this.numOfRows = numOfRows;
    }

    public Integer getNumInRow() {
        return numInRow;
    }

    public void setNumInRow(Integer numInRow) {
        this.numInRow = numInRow;
    }

    public void add(String colorNum, Integer rowNum, Integer positionInRow){
        Color color = new Color(colorNum);
        pixelArray[rowNum][positionInRow] = color.getColorNumber();
    }

    public void addAll(){}

//    public ? getAll(String colorNum){ returns all locations of specific color }

    public void changeAll(String colorNum, String newColorNum){
        //changes all instances of colorNum to newColorNum
    }

    public String getPixelColor(Integer rowNum, Integer positionInRow){
        return "";
    }

}
