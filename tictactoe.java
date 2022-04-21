import java.util.Scanner;
public class tictactoe{
    
    board gameBoard = new board();
    check check = new check();
    accessor accessor = new accessor();
    Scanner scan = new Scanner(System.in);
    
    private Object player1;
    private Object player2;
    
    private Boolean player1Turn;
    private Boolean player2Turn;
    
    public static void main(String[] args) {
        
    }
    public void begin(){
        System.out.println("Set player 1 letter: ");
        String setPlayer1 = scan.nextLine();
        player tempplayer1 = new player(setPlayer1);
        player1=tempplayer1;
        System.out.println("Set player 2 letter: ");
        String setPlayer2 = scan.nextLine();
        player tempplayer2 = new player(setPlayer2);
        player2=tempplayer2;
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
