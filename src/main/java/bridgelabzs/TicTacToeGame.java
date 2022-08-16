package bridgelabzs;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static char userLetter;
    static char computerLetter;
    static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		char[][] board = {{' ', ' ', ' '},
				 	      {' ', ' ', ' '}, 
				 	      {' ', ' ', ' '}};
		showBoard(board);

	}
	private static void makeMove() {
		System.out.println("Choose your location(1-9): ");
        int position = scanner.nextInt();
        if (position > 9 && position < 1) {
            System.err.println("Enter a valid location b/w 1 to 9");
            makeMove();
        } else if (board[position] != ' ') {
            System.err.println("You already chosen this! Enter a valid location");
            makeMove();
        } else {
            board[position] = userLetter;
            showBoard();
            checkFreeSpace();
            makeMove();
        }	}
	private static void checkFreeSpace() {
		boolean isSpaceAvailable = false;
        int numOfFreeSpaces = 0;
        for(int index=1;index<board.length;index++)
        {
            if((board[index] == ' '))
            {
                isSpaceAvailable = true;
                numOfFreeSpaces++;
            }
        }
        if(isSpaceAvailable == false)
        {
            System.err.println("Board is full! You can't make another move");

        }
        else
        {
            System.out.println("Free space is available! you have "+numOfFreeSpaces+ " moves left");
        }
    }
	   
	private static void showBoard(char[][] board) {
		System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
	}
	private static void chooseLetter() {
		// TODO Auto-generated method stub
		
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
        
		
	}
	private static void computerTurn(char[][] board) {
		Random rand = new Random();
		int computerMove;
		while (true) {
			computerMove = rand.nextInt(9) + 1;
			if (isValidMove(board, Integer.toString(computerMove))) {
				break;
			}
		}
		System.out.println("Computer chose " + computerMove);
		placeMove(board, Integer.toString(computerMove), 'O');
	}
}
