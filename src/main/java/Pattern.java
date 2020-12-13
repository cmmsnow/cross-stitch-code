import java.util.HashMap;
import java.util.Map;

/**
 * need this class to take a colorList and put it in hashmap with locationKey
 *
 * MUST REMEMBER TO HANDLE OPTIONALS WHEN CREATING FROM COLORARRAY!
 */

public class Pattern {
    private Map<String, String> crossStitchData;
    private String locationKey;
    private Integer numOfRows;
    private Integer numOfColumns;
    private String colorNumber;
    //private ENUM

    public Pattern(ColorArray colorArray) {
        this.numOfRows = colorArray.getNumOfRows();
        this.numOfColumns = colorArray.getNumOfColumns();
        this.crossStitchData = new HashMap<>();

        //call addAll() here to fill hashmap

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

    public void addSquare(Integer rowNum, Integer columnNum, String colorNum){ //should this be "changeSquare"?
        // Color color = new Color(colorNum); - do i even want to create an object?
        locationKey = rowNum + "x" + columnNum;
        crossStitchData.put(locationKey, colorNum);
    }

    public void addAll(ColorArray colors){
        //adds value for every single square
        for (int i=1; i<=numOfRows; i++){ //create all the location keys & add to hashmap with color
            for (int j=1; j<=numOfColumns; j++){
                //REMEMBER TO USE OPTIONALS
            }
        }
    }

    public Integer getTotalOfColor(String colorNum){
        Integer numOfOccurencesOfColor = 0; //counter
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
        StringBuilder printer = new StringBuilder(); //append colorName(value) for every key, by row number.
        int counter = 0;
        for (String k : crossStitchData.keySet()){
            String formattedValue = String.format("|%1$-11s", crossStitchData.get(k)); //longest is currently 9, so give it | 11 spaces |
            printer.append(formattedValue);
            counter++;
            if (counter == numOfColumns){
                printer.append("|\n"); //append line break at end of each row.
                counter = 0;
            }
        }
        return printer.toString();
    }

}
