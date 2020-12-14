import java.util.*;

/**
 * need this class to take a colorList and put it in hashmap with locationKey
 */

public class Pattern {
    private Map<String, String> crossStitchData;
    private String locationKey;
    private Integer numOfRows;
    private Integer numOfColumns;
    String[] colorAr;

    public Pattern(ColorArray colorArray) {
        this.numOfRows = colorArray.getNumOfRows();
        this.numOfColumns = colorArray.getNumOfColumns();
        colorAr = colorArray.getColorArray();
        this.crossStitchData = addAllToMap(createLocationKeys(numOfRows, numOfColumns), colorAr);
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

    public void changeSquare(Integer rowNum, Integer columnNum, String colorNum){
        // Color color = new Color(colorNum);
        locationKey = "R" + rowNum + "C" + columnNum;
        crossStitchData.put(locationKey, colorNum);
    }

    //creates all the location keys
    public ArrayList<String> createLocationKeys(Integer howManyRows, Integer howManyColumns){
        ArrayList<String> keyList = new ArrayList();
        for (int i=1; i<=howManyRows; i++){
            for (int j=1; j<=howManyColumns; j++){
                locationKey = "R" + i + "C" + j;
                keyList.add(locationKey);
            }
        }
        return keyList;
    }

    public Optional<String> getElementAtI(Integer i){
        return Optional.ofNullable(colorAr[i]);
    }

    //creates hashmap and adds each key/value pair for whole pattern
    public HashMap<String, String> addAllToMap(ArrayList<String> keys, String[] colors){
        HashMap<String, String> thePattern = new HashMap<>();
        for (int i=0; i<keys.size(); i++){
            thePattern.put(keys.get(i), getElementAtI(i).orElse("[empty]"));
        }
        return thePattern;
    }

    //returns number of keys with this colorValue
    public Integer getTotalOfColor(String colorName){
        Integer numOfOccurencesOfColor = 0;
        for (String k : crossStitchData.keySet()){
            if (crossStitchData.get(k).equalsIgnoreCase(colorName)) numOfOccurencesOfColor++;
        }
        return numOfOccurencesOfColor;
    }

    //changes all values matching colorNum to newColorNum //NOT PASSING TEST
    public void changeAll(String oldColor, String newColor){
        for (String k : crossStitchData.keySet()){
            if (crossStitchData.get(k).equalsIgnoreCase(oldColor)){
                crossStitchData.replace(k, newColor);
            }
        }
    }

    public String getSquareColor(Integer rowNum, Integer columnNum){
        locationKey = "R" + rowNum + "C" + columnNum;
        return crossStitchData.get(locationKey);
    }

    //NOT CENTERING COLOR WHEN PRINTING
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
