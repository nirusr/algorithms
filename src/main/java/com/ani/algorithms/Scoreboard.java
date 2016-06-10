package com.ani.algorithms;

public class Scoreboard {
	private int fillIndex = 0;
	private GameEntry[] board;
	private int count=0;

	public Scoreboard(int capacity) {
		// TODO Auto-generated constructor stub
		board = new GameEntry[capacity];

	}

	public void add(GameEntry e) {
		
		if (fillIndex < board.length) {

			board[fillIndex] = e;

			if (fillIndex > 0) {
				
				for (int i = fillIndex; i > 0; i--) {
					count++;
					//System.out.println(board[i] + "-" + board[i - 1]);
					if (board[i].getScore() > board[i - 1].getScore()) {
						GameEntry tempBoard = board[i];
						board[i] = board[i - 1];
						board[i - 1] = tempBoard;

					}
					//System.out.println(board[i]);
				}

			}
			fillIndex++;
		}
		
	}
	
	public void printGameBoard() {
		for (int x = 0; x < fillIndex; x++) {
			System.out.print(board[x].getScore() + ",") ;
			
			
		}
		System.out.println("\n" + "No of operations=" + count);
	}

	public static void main(String[] args) {
		Scoreboard sb = new Scoreboard(10);
		GameEntry ge1 = new GameEntry("1Srini", 10);
		sb.add(ge1);

		GameEntry ge2 = new GameEntry("2Srini", 8);
		sb.add(ge2);

		GameEntry ge3 = new GameEntry("3Srini", 71);
		sb.add(ge3);

		GameEntry ge4 = new GameEntry("4Srini", 20);
		sb.add(ge4);
		

		GameEntry ge5 = new GameEntry("4Srini", 6);
		sb.add(ge5);
		
		GameEntry ge6 = new GameEntry("4Srini", 61);
		sb.add(ge6);
		
		sb.printGameBoard();
		
		
	}

}
