
/**
 * need this class to access the colorName from database
 */

public class Color {
    private String colorNumber;

    public Color(String colorNumber){
        this.colorNumber = colorNumber;
    }

    public String getColorNumFromDatabase() {
        //use this to get color from database!
        return "";
    }

    public void setColorNumber(String colorNumber) {
        this.colorNumber = colorNumber;
    }

    public String getColorNumber() {
        return colorNumber;
    }
}
