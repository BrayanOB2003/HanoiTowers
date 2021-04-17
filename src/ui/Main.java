package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void hanoi(int n, int origin, int aux, int destiny) {
		System.out.println(origin + " " + aux + " " + destiny);
		if(n==1) {
			System.out.println((origin-1) + " " + aux + " " + (destiny+1));
		} else {
			hanoi(n - 1, origin - 1, aux, destiny + 1);
			System.out.println(origin + " " + aux + " " + destiny);
			hanoi(n-1,origin-1 , aux+1, destiny);
		}
	}
	
	public static void iterate(int x, int n) {
		
		if(x < n) {
			hanoi(n, n, 0, 0);
			System.out.println();
			iterate(x+1, n);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());
		int n = 0;
		for(int i = 0; i < size; i++) {
			n = Integer.parseInt(bf.readLine());
			hanoi(n, n, 0, 0);
			System.out.println("");
		}
		
		
	}

}
