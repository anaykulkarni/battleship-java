import java.util.*;

public class HelperTest {
    
    public static void main(String[] args) {
        GameHelper g = new GameHelper();
        ArrayList<String> test = g.computeLocations();
        System.out.println(test.get(0) + " " + test.get(1) + " " +test.get(2));
    }
}