package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int user = sc.nextInt();
			a.add(user);
		}
		
		System.out.println();
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int user = sc.nextInt();
			b.add(user);
		}
		
		System.out.println();
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int user = sc.nextInt();
			c.add(user);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println();
		System.out.print("Total students: " + total.size());
		
		
		
		sc.close();
		
		

	}

}
