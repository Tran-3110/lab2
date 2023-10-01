package main;

public class TowerOfHaNoi {
	
	static char[] c = new char[] {'A', 'B', 'C'};
	public static void towerOfHanoi(int n) {
		towerOfHanoiHelp(n, 0, 2, 1);
	}
	public static void towerOfHanoiHelp(int n, int i, int j, int k) {
		if(n==1) {
			System.out.println("Di chuyen dia "+n+" tu cot "+ c[i] +" sang cot "+c[j]);
		}
		else {
			towerOfHanoiHelp(n-1, i, k, j);
			System.out.println("Di chuyen dia "+n+" tu cot "+ c[i] +" sang cot "+c[j]);
			towerOfHanoiHelp(n-1, k, j, i);
		}
		
	}
	public static void main(String[] args) {
		towerOfHanoi(3);
	}
}
