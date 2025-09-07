//the famous nQueen problem with recurrsion and backtracking
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 20; //noof rows and noof columns in the board
		boolean[][] board = new boolean[n][n];
		System.out.println(nQueen(board, 0));
		
	}

  //return noof valid possible positions to place n queens in n * n board
	public static int nQueen(boolean[][] board, int row){
	    if(row == board.length){
        //if reaches board length, means we successfully placed all queens
	        display(board); // display the board
	        System.out.println();
	        return 1;
	    }
	    //initialise the count variable and return at the end
	    int count = 0;
    //using a for loop instead of an extra argument like column
    //we can take column argument instead of this forloop
	    for(int i = 0; i < board.length; i++){
        //checking the safety of the current position, if it is safe, then place a queen and make the board true, then pass the board for the next recursive call
        //if the cell is not safe the continue with the next column
	        if(isSafe(board, row, i)){
	            board[row][i] = true;
            //if it is safe make true aswe placed the queen
            // pass the board after placing the queen with next row as yet to place row
	            count += nQueen(board, row + 1);
            // after checking the cell placed the remove queen from cell and place on the next cell 
            //backtracking
	            board[row][i] = false;
	        }
	    }
	    return count;
	}
  //checking the safety of the cell
	public static boolean isSafe(boolean[][] board, int r, int c){
	    for(int i = 0; i<board.length; i++){
	        if(board[i][c])return false;
	    }
	    int minleft = Math.min(r, c);
	    for(int i = 1; i<=minleft; i++){
	        if(board[r - i][c - i])return false;
	    }
	    int minright = Math.min(r, (board.length - c) - 1);
	    for(int i = 1; i <= minright;i++){
	        if(board[r - i][c + i])return false;
	    }
	    
	    return true;
	}

  //displaying the board
	public static void display(boolean[][] board){
	    for(boolean[] ar:board){
	        for(boolean b : ar){
	            if(b)System.out.print("Q ");
	            else System.out.print("X ");
	        }
	        System.out.println();
	    }
	}
}
