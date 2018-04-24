import java.util.*;

public class GameHelper {
    private ArrayList<String> checkList = new ArrayList<String>();
    
    public ArrayList<String> computeLocations(){

        ArrayList<String> loc = new ArrayList<String>();
        do{
            int chooseRC = (int) (Math.random()* 2);
            switch(chooseRC){
                case 0: char row = (char) (Math.random()*7 + 65);
                        int col = (int) (Math.random()* 5);
                        String l1 =  Integer.toString(col);
                        String l2 =  Integer.toString(col +1); 
                        String l3 =  Integer.toString(col+2);
                        loc.add(0, row+l1);
                        loc.add(1, row+l2);
                        loc.add(2, row+l3);
                        break;
                case 1: int c = (int) (Math.random()* 7);
                        int tempRow = (int) (Math.random()*5 + 65);
                        char row1 = (char) tempRow++;
                        char row2 = (char) tempRow++;
                        char row3 = (char) tempRow;
                        String column =  Integer.toString(c);

                        loc.add(0, row1+column);
                        loc.add(1, row2+column);
                        loc.add(2, row3+column);
                        break;
            }
            for(int i=0; i<3; i++){    
                checkList.add(loc.get(i));
            } 
        }while( !(checkList.contains(loc.get(0))) && !(checkList.contains(loc.get(1))) && !(checkList.contains(loc.get(2))) );
        
        return loc;
    }
}