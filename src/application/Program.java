package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int user = sc.nextInt();
			set.add(user);
		}
		
		System.out.println();
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int user = sc.nextInt();
			set.add(user);
		}
		
		System.out.println();
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int user = sc.nextInt();
			set.add(user);
		}
		
		System.out.println();
		System.out.print("Total students: " + set.size());
		
		
		
		sc.close();
		
		

	}

}
