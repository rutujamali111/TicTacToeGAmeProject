package bridgelabzs;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static char userLetter;
    static char computerLetter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 createEmptyBoard();
		 chooseLetter();
		 showBoard();


	}
	private static void showBoard() {
		// TODO Auto-generated method stub
		System.out.println( board[1] + " | " + board[2] + " | " + board[3] );
        System.out.println("----------");
        System.out.println( board[4] + " | " + board[5] + " | " + board[6] );
        System.out.println("----------");
        System.out.println( board[7] + " | " + board[8] + " | " + board[9] );
		
	}
	private static void chooseLetter() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
        scanner.close();
		
	}
	private static void createEmptyBoard() {
		// TODO Auto-generated method stub
		for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
		
	}

}
