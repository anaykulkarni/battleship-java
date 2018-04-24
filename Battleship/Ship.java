import java.util.*;

public class Ship {
    private ArrayList<String> locationCells;
    private String name;
    
    public void setName(String n) {
        name = n;
    }
    public void setLocationCells( ArrayList<String> loc) {
        locationCells = loc;
    }
    
    public String checkYourself(String userInput){
        String result = "miss";
        
        //This removes the location if the ship is hit
        if(locationCells.contains(userInput)){
            result = "hit";
            locationCells.remove(userInput);
        }
        if(locationCells.isEmpty()){
            result = "kill";
            System.out.println("Ouch... You sunk " + name + "!");
        }
        return result;         
    }

}