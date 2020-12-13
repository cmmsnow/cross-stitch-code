import java.util.ArrayList;
import java.util.List;

/**
 * holds all pattern hashmaps
 */

public class AllPatterns {
    private List<Pattern> allPatterns;

    public AllPatterns(){
        this.allPatterns = new ArrayList<Pattern>();
    }

    public void addPattern(Pattern pattern){
        allPatterns.add(pattern);
    }

    public List<Pattern> getPatterns(){
        return this.allPatterns;
    }
}
