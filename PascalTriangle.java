package main;

import java.util.Arrays;

public class PascalTriangle {
	// This method is used to display a Pascal triangle based
	// on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
		if (row <= 1) {
			System.out.println(Arrays.toString(getPascalTriangle(row)));
		} else {
			printPascalTriangle(row - 1);
			System.out.println(Arrays.toString(getPascalTriangle(row)));
		}
	}
	

	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		if (n <= 1) {
			return new int[] { 1 };
		} else {
			return generateNextRow(getPascalTriangle(n - 1));
		}
	}
	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int[] result = new int[prevRow.length + 1];
		generateNextRowHelp(prevRow, 0, result);
		return result;
	}

	public static void generateNextRowHelp(int[] prevRow, int i, int[] result) {
		if (i == result.length - 1) {
			result[i] = 1;
		} else {
			if (i == 0) {
				result[i] = 1;
				generateNextRowHelp(prevRow, i + 1, result);
			} else {
				result[i] = prevRow[i - 1] + prevRow[i];
				generateNextRowHelp(prevRow, i + 1, result);
			}
		}
	}

	public static void main(String[] args) {
		printPascalTriangle(5);
	}
}
