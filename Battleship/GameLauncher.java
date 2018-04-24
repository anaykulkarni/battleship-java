import java.util.*;

public class GameLauncher {
    private GameHelper helper = new GameHelper();
    private ArrayList<Ship> shipList = new ArrayList<Ship>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        //create ship objects for the shiplist and name them.
        Ship one = new Ship();
        one.setName("Delta");
        Ship two = new Ship();
        two.setName("Alpha");
        Ship three = new Ship();
        three.setName("Foxtrot");
        //add the objects to the list.
        shipList.add(one);
        shipList.add(two);
        shipList.add(three);
        
        //display instructions.
        System.out.println("Your goal is to sink three ships, Delta, Alpha, Foxtrot. Try to sink them in the fewest number of guesses!");
        
        //set locations for each ship in the shiplist.
        for(Ship s : shipList){
            s.setLocationCells(helper.computeLocations());
        }     
    }
    
    private void play(){
        while(!shipList.isEmpty()){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your guess: ");
            String userInput = scan.nextLine();
            numOfGuesses++; 
            String result = "miss";
            for(Ship s : shipList){
                result = s.checkYourself(userInput);
                if(result.equals("kill")){
                    shipList.remove(s);
                    break;
                }
                else if(result.equals("hit")){
                    break;
                }
            }
            System.out.println(result);
        }
        finishGame();
    }
    private void finishGame(){
        System.out.println("All the ships are sunk!");
        System.out.println("It took you " + numOfGuesses + " guesses.");
    }
    
    public static void main(String[] args) {
        GameLauncher game = new GameLauncher();
        game.setUpGame();
        game.play();
    }
}