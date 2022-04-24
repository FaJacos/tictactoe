import java.util.Scanner;

import javax.swing.text.html.parser.Parser;
public class tictactoe{
    
    Scanner scan = new Scanner(System.in);
    
    private Object player1;
    private Object player2;
    private static board gameBoardObj;
    private static check checkObj;
    private static accessor accessorObj;
    
    private Boolean player1Turn;
    private Boolean player2Turn;
    
    public static void main(String[] args) {
        board gameBoard = new board();
        gameBoardObj = gameBoard;
        check check = new check();
        checkObj = check;
        accessor accessor = new accessor();
        accessorObj = accessor;

        gameBoard.begin();
        gameBoard.playerInput();
    }

    public boolean game(){
        return true;

    }

    /*public void playerInput(){
        System.out.println("Input move (Letter,Number)");
        String p = scan.next();
        if ((p.length() > 0 && p.length() < 3) && (parse(p)[1] == (Integer)parse(p)[1]) && (parse(p)[0]==)){
            //do true
        }
        else{
            System.out.println("Error");
            playerInput();
        }
    }
    
    public Object[] parse(String b){
        Object[] hold = new String[2];

        hold[0] = String.parseStr(b.substring(0,1));
        hold[1] = Integer.parseInt(b.substring(1,2));
        return hold;
    }*/

    public void begin(){
        System.out.println("Set player 1 letter: ");
        String setPlayer1 = scan.nextLine();
        player tempplayer1 = new player(setPlayer1);
        player1=tempplayer1;
        System.out.println("Set player 2 letter: ");
        String setPlayer2 = scan.nextLine();
        player tempplayer2 = new player(setPlayer2);
        player2=tempplayer2;
        gameBoardObj.printBoard();
        System.out.println("Randomizing turn now \n "+ gameBoardObj.randomizer());
    }


    public String randomizer(){
        double r = Math.random();
        if (r>.5){
            player1Turn=true;
            player2Turn=false;
            return "Player 1 start";
        }
        else {
            player1Turn=false;
            player2Turn=true;
            return "Player 2 start";
        }
    }
    public Boolean getPlayer1Turn(){
        return player1Turn;
    }
    public Boolean getPlayer2Turn(){
        return player2Turn;
    }
    public Object getPlayer1() {
        return player1;
    }
    public Object getPlayer2() {
        return player2;
    }
}
