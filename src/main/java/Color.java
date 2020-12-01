/**
 * stores pixel color value
 *
 * maybe this should actually be an Enum class with all DMC threads' color numbers?
 */

public class Color {
    private String colorNumber;

    public Color(String colorNumber){
        this.colorNumber = colorNumber;
    }

    public String getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(String colorNumber) {
        this.colorNumber = colorNumber;
    }
}
