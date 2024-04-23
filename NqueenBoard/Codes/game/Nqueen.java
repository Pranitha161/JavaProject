package game;
import board.Nqueenboard;
public class Nqueen {
    Nqueenboard b;
    public Nqueen(Nqueenboard b){
        this.b=b;
    }
    public void play(){
        if(b.size<4){
            System.out.println("No Configuration");
            return;
        }
        nqueen(b.board,0);
    }
    private void nqueen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            System.out.println();
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafeQueen(board,row,col)==true){
                board[row][col]='Q';
                nqueen(board,row+1);
                board[row][col]='-';
            }
        }
    }
        private boolean isSafeQueen(char board[][],int row,int col){
            for(int i=row-1,j=col-1;j>=0&&i>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            for(int i=row-1,j=col+1;j<board.length&&i>=0;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            return true;
        }
        private void printBoard(char board[][]){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    
}
