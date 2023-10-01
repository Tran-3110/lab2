package main;

public class Task_2 {
	
	static boolean flags;
	static int LENGTH;
	public static void drawPyramid(int n) {
		if(!flags) {
			LENGTH = 2*n - 1;
			flags = true;
		}
		if(n == 0) {
			flags = false;
			return;
		}
		else {
			drawPyramid(n-1);
			drawPyramidHelp((LENGTH/2) - (2*n-1)/2, (LENGTH/2) + (2*n-1)/2, LENGTH, 0);
			System.out.println();
		}
	}
	
	public static void drawPyramidHelp(int indexStart, int indexEnd, int length, int i)  {
		if(i==length) {
			return;
		}
		else {
			if(indexStart<=i && i<=indexEnd) {
				System.out.print("X");
			}
			else {
				System.out.print(" ");
			}
			drawPyramidHelp(indexStart, indexEnd, length, i+1);
 		}
	}
	
	
	// optional Task 2.3
	public static void drawChristmasTree(int n) {
		if(!flags) {
			LENGTH = 2*n - 1;
			flags = true;
		}
		if(n == 0) {
			flags = false;
			return;
		}
		else {
			drawChristmasTree(n-1);
			flags = true;
			drawPyramid(n);
		}
	}
	
	public static void main(String[] args) {
		drawPyramid(10);
		System.out.println("=====================");
		drawChristmasTree(15);
		System.out.println("=====================");
		drawPyramid(10);
		System.out.println("=====================");
		drawChristmasTree(15);
	}


}
