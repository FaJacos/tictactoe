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
}
