package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.entity.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Set<Product> set = new TreeSet<Product>();
		
		set.add(new Product("Tv", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		for (Product product : set) {
			System.out.println(product);
		}
		
		sc.close();
		
	}

}
