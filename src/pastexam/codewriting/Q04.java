package pastexam.codewriting;

import java.util.Scanner;

public class Q04 {

	/*
	 * You are given a two dimensional array of integers called data. 
	 * Choose integers at random from data and store them in 
	 * a one dimensional array of size N called points. 
	 * Each value from data should have an equal chance of being 
	 * selected and a particular value could be randomly selected more
	 * than once (in probability and statistics it�s considered 
	 * a uniform random sample with replacement).
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some rows
		//and columns to make sure your solution
		//works properly.
		int[][] data = { {1, 2, 3}, {4, 5, 6}, {90, 10, 900}, {10, 20, 30}}; 
		
		System.out.println("How many random points would you like?");
		int n = in.nextInt();
		in.close();
		int[] points = new int[n];
		for (int i = 0; i < n; i++) {
			int x = (int)(Math.random()*data.length);
			int y = (int)(Math.random()*data[0].length);
			points[i] = data[x][y];
		}
		for (int z = 0; z < points.length; z++) {
			System.out.println(points[z]);
		}

		
	}
}
