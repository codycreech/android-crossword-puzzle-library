package com.project.crosswordpuzzleactivity;

public class Board {
	
	/**
	 * @Board creates the board with a 15x15 grid.
	 * 
	 * @author codycreech
	 */
	
	public static final int size = 15;
	
	String[][] board;
	
	public Board()
	{
		board = new String[size][size];
	}
	
	

}
