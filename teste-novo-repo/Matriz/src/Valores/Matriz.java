package Valores;

import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {
		
		int num[] = new int[20];
		for(int i=0; i<20; i++) {
			System.out.print(num[i]+ " ");
		}
		
		Arrays.sort(num);
		System.out.println();
		for(int i=0; i<20; i++) {
			System.out.println(num[i]);
		}
		Arrays.fill(num, 10);
		System.out.println();
		for (int i=0; i<20; i++) {
			System.out.println(num[i]);
		}
	}

}
