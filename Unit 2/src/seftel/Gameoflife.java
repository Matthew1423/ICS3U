package seftel;

import java.util.Scanner;
/**
 * Gameoglife.java
 * The game simulates a game of life. the users chooses the amount of cells to start with and depending on the amount of neighbours, the cells stays alive another day or dies.
 * @author Matthew Seftel
 *
 *
 */

	public class Gameoflife {

	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of cells you want to start with, must be less that 400");  
			int[][] Grid = new int[20][20]; 
			int cellsX = scan.nextInt();
			for (int i = 0; i < cellsX; i++) {
				System.out.println("Please enter the coordinates of the cell"); 
				int Row = scan.nextInt();
				int Column = scan.nextInt();
				Grid[Row][Column] = 1;  

			}
			for (int i = 0; i < Grid.length; i++) { 
				for (int j = 0; j < Grid[i].length; j++) {
					System.out.print(Grid[i][j]);
				}
				System.out.println();
			} 
			int value = 0;
			boolean Phase2 = true;
			for (int Phase1 = 1;  Phase2  == true && cellsX !=0; Phase1++) { 
				int[][] Grid2 = new int [20][20];
				for(int i = 0; i < 20; i ++){
					for(int k = 0; k < 20; k ++){
						Grid2[i][k] = 0;
					}
				}
				System.out.println("Do you want to continue to the next day? (true/ false)"); 
				 Phase2 = scan.nextBoolean();
				 value = 0;
				for (int i = 0; i < Grid.length; i++) {
					value = 0;
					for (int j = 0; j <Grid[i].length; j++) {


						if (Grid[i][j] == 1) {
							if (Grid[i].length > j + 1) {
								if (Grid[i][j + 1] == 1) {
									value++;
								}
							}
							if (Grid[i].length > j - 1 && j - 1 >= 0) {
								if (Grid[i][j - 1] == 1) {
									value++;
								}
							}
							if (Grid.length > i - 1 && i - 1 >= 0) {
								if (Grid[i - 1][j] == 1) {
									value++;
								}
							}
							if (Grid.length > i + 1) {
								if (Grid[i + 1][j] == 1) {
									value++;
								}
							}
							if (Grid.length > i - 1 && Grid[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
								if (Grid[i - 1][j - 1] == 1) {
									value++;
								}
							}
							if (Grid.length > i - 1 && Grid[i].length > j + 1 && i - 1 >= 0) {
								if (Grid[i - 1][j + 1] == 1) {
									value++;
								}
							}

							if (Grid.length > i + 1 && Grid[i].length > j - 1 && j - 1 >= 0) {
								if (Grid[i + 1][j - 1] == 1) {
									value++;
								}
							}

							if (Grid.length > i + 1 && Grid[i].length > j + 1) {
								if (Grid[i + 1][j + 1] == 1) {
									value++;
								}
							}
							if (value == 2 || value == 3) {
								Grid2[i][j] = 1;
								cellsX++;
							} else if (value == 1 || value == 4 || value == 5 || value == 6 || value == 7|| value == 8) {
								Grid2[i][j] = 0;
								cellsX--;
							}

							value = 0;

						} else if (Grid[i][j] == 0) {

							value=0;
							if (Grid[i].length > j + 1) {
								if (Grid[i][j + 1] == 1) {
									value++;
								}
							}
							if (Grid[i].length > j - 1 && j - 1 >= 0) {
								if (Grid[i][j - 1] == 1) {
									value++;
								}
							}
							if (Grid.length > i - 1 && i - 1 >= 0) {
								if (Grid[i - 1][j] == 1) {
									value++;
								}
							}
							if (Grid.length > i + 1) {
								if (Grid[i + 1][j] == 1) {
									value++;
								}
							}
							if (Grid.length > i - 1 && Grid[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
								if (Grid[i - 1][j - 1] == 1) {
									value++;
								}
							}
							if (Grid.length > i - 1 && Grid[i].length > j + 1 && i - 1 >= 0) {
								if (Grid[i - 1][j + 1] == 1) {
									value++;
								}
							}
							if (Grid.length > i + 1 && Grid[i].length > j - 1 && j - 1 >= 0) {
								if (Grid[i + 1][j - 1] == 1) {
									value++;
								}
							}
							if (Grid.length > i + 1 && Grid[i].length > j + 1) {
								if (Grid[i + 1][j + 1] == 1) {
									value++;
								}
							}
							if (value == 3) {
								Grid2[i][j] = 1;
								cellsX++;
							}
							else if (value == 1 || value == 2 || value == 4 || value == 5 || value == 6|| value == 7 || value == 8) {
								Grid2[i][j] = 0;
							}

							
						}
					}
				}
				Grid = Grid2;
				for(int i = 0; i < 20; i++){
					for (int j = 0; j < 20; j++){
						System.out.print(Grid2[i][j]);
					}
					System.out.println();
				}
			}
		}
	}
