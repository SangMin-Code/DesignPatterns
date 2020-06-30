package com.test.templatemethod;

import java.util.Arrays;

public class DuckSortTestDrive {
	public static void main(String[] args) {
		Duck[] ducks = {
							new Duck("Daffy",8),
							new Duck("Dewey",2),
							new Duck("Howard",7),
							new Duck("Louie",2),
							new Duck("Donald",10),
							new Duck("Huey",8),							
		};
		
		System.out.println("정렬 전:");
		display(ducks);
		
		Arrays.sort(ducks);
		System.out.println("\nAfter sorting");
		display(ducks);		
	}
	public static void display(Duck[] ducks) {
		for(int i=0; i<ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
