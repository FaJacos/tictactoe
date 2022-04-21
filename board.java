public class board extends tictactoe{

    private String[][] gameBoard = {
        {"-","-","-"},
        {"-","-","-"},
        {"-","-","-"}
    };

    public board(){
    }

    public void printBoard(){
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                System.out.print("["+gameBoard[i][j]+"] ");
            }
            System.out.println();
        }
    }
    
    public void clearBoard(){
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[0].length; j++){
                gameBoard[i][j]="-";
            }
        }
    }

    public String[][] getBoard(){
        return gameBoard;
    }
    
    public boolean spaceAvail(int y, int x){
        if (gameBoard[y][x] == "-"){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean set(int y, int x, String player){
        if (spaceAvail(y,x) == true){
            gameBoard[y][x] = player;
            return true;
        }
        else{
            return false;
        }
    }
}
