package ui;

import java.util.Scanner;

public class Main {
	
	public static void hanoi(int n, int c, int origin, int aux, int destiny) {
		System.out.println(origin + " " + aux + " " + destiny);
		int cont = c;
		if(n==1) {
			System.out.println((origin-1) + " " + aux + " " + (destiny+1));
		} else {
			hanoi(n - 1, cont++, origin - 1, aux, destiny + 1);
			System.out.println(origin + " " + aux + " " + destiny);
			hanoi(n-1,cont++,origin-1 , aux+1, destiny);
			
		}
	}
	
	public static void iterate(int x, int n) {
		
		if(x < n) {
			System.out.println(n+" 0 0");
			hanoi(n, 1, n, 0, 0);
			System.out.println();
			iterate(x+1, n);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		//System.out.println(n+" 0 0");
		hanoi(n, 0, n, 0, 0);
	}

}
