import java.util.*;

/**
 * this class takes a colorList and puts it in pattern hashmap with locationKey
 */

public class Pattern {
    private Map<String, String> crossStitchData;
    private String locationKey;
    private Integer numOfRows;
    private Integer numOfColumns;
    String[] colorAr;
    ArrayList<String> keyList;

    public Pattern(ColorArray colorArray) {
        this.numOfRows = colorArray.getNumOfRows();
        this.numOfColumns = colorArray.getNumOfColumns();
        colorAr = colorArray.getColorArray();
        keyList = createLocationKeys(numOfRows, numOfColumns);
        this.crossStitchData = addAllToMap();
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

    //DID NOT TEST INDIVIDUALLY
    public ArrayList<String> createLocationKeys(Integer howManyRows, Integer howManyColumns){
        ArrayList<String> keys = new ArrayList<>();
        for (int i=1; i<=howManyRows; i++){
            for (int j=1; j<=howManyColumns; j++){
                locationKey = "R" + i + "C" + j;
                keys.add(locationKey);
            }
        }
        return keys;
    }

    public String getElementAtI(Integer i, String[] input){
        return Optional.ofNullable(input[i]).orElse("[empty]");
//        if (input[i] != null){
//            System.out.println(input[i]);
//            return input[i];
//        } else {
//            return "[empty]";
//        }
    }

    //DID NOT TEST INDIVIDUALLY
    public HashMap<String, String> addAllToMap(){
        HashMap<String, String> thePattern = new HashMap<>();
        for (int i=0; i<this.keyList.size(); i++){
            //System.out.println(this.keyList.size() + " " + this.colorAr.length);
            thePattern.put(this.keyList.get(i), getElementAtI(i, this.colorAr));
            //System.out.println(this.keyList.get(i) + " " + getElementAtI(i, this.colorAr));
        }
        return thePattern;
    }

    public Integer getTotalOfColor(String colorName){
        Integer numOfOccurencesOfColor = 0;
        for (String k : crossStitchData.keySet()){
            if (crossStitchData.get(k).equalsIgnoreCase(colorName)) numOfOccurencesOfColor++;
        }
        return numOfOccurencesOfColor;
    }

    public void changeAllOfOneColor(String oldColor, String newColor){
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

    public String centerString (int width, String s) {
        return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }

    public String printMe(){
        StringBuilder printer = new StringBuilder();
        int counter = 0;
        for (String k : keyList){
            String formatted = centerString(9, crossStitchData.get(k));
            printer.append("|" + formatted);
            counter++;
            if (counter == numOfColumns){
                printer.append("|\n");
                System.out.println(printer.toString());
                counter = 0;
                printer.setLength(0);
            }
        }
        return printer.toString();
    }

}
