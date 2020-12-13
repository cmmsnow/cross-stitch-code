import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * need this class to take a Pattern pattern colorList and put it in hashmap with locationKey
 */

public class Pattern {
    private Map<String, String> crossStitchData;
    private List keyList;
    private String locationKey;
    private Integer numOfRows;
    private Integer numOfColumns;
    private String colorNumber;

    public Pattern(Integer rows, Integer columns) {
        this.numOfRows = rows;
        this.numOfColumns = columns;
        this.crossStitchData = new HashMap<>();
        this.keyList = new ArrayList(); //where the keySet will be held in order by row
    }

    public Map<String, String> getCrossStitchMap(){return crossStitchData;}

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer rows) {
        this.numOfRows = rows;
    }

    public Integer getNumOfColumns() {
        return numOfColumns;
    }

    public void setNumOfColumns(Integer columns) {
        this.numOfColumns = columns;
    }

    public void addSquare(Integer rowNum, Integer columnNum, String colorNum){
        // Color color = new Color(colorNum); - do i even want to create an object?
        locationKey = rowNum + "x" + columnNum;
        crossStitchData.put(locationKey, colorNum);
    }

    public void addAll(){
        //adds value for every single square
    }

    public Integer getAll(String colorNum){
        Integer numOfOccurencesOfColor = 0; //counter
        //create all the location keys
        for (int i=1; i<=numOfRows; i++){
            for (int j=1; j<=numOfColumns; j++){

            }
        }
        //check all location keys' colorValue
        return numOfOccurencesOfColor; //number of keys with this colorValue
    }

    public void changeAll(String colorNum, String newColorNum){
        //changes all values of colorNum to newColorNum
    }

    public String getSquareColor(Integer rowNum, Integer columnNum){
        locationKey = columnNum + "x" + rowNum;
        return crossStitchData.get(locationKey);
    }

    public String printMe(){
        StringBuilder printer = new StringBuilder();
        //append colorName(value) for every key, by row number.
        //append line break at each row
        return printer.toString();
    }

}
