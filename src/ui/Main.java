package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	private static Integer[] towers;
	private final static int  origin = 0;
	private final static int  aux = 1;
	private final static int desti = 2;
	
	public static void hanoi(int n, int org, int destiny, int ax, Integer[] tower) {
		
		if(n > 0) {
				hanoi(n - 1, org, ax, destiny, tower);
				tower[org]--;
				tower[ax]++;
				
				System.out.println(towers[origin] + " " + towers[aux] + " " + towers[desti]);
				
				hanoi(n - 1, destiny, org, ax, tower);
		}
		
	}
	
	public static void moviment(int n) {
		towers = new Integer[3];
		
		towers[origin] = n;
		towers[aux] = 0;
		towers[desti] = 0;
		
		System.out.println(towers[origin] + " " + towers[aux] + " " + towers[desti]);
		
		hanoi(n, 0, 1, 2, towers);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());
		int n = 0;
		for(int i = 0; i < size; i++) {
			n = Integer.parseInt(bf.readLine());
			
			moviment(n);
			System.out.println("");
		}
		
		bf.close();
	}

}
