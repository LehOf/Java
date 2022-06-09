package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("DLeila");
		list.add("Leilaaa");
		list.add("LeLeeeila");
		list.add("LeLiiiila");
		list.add("Leilaaaa");
		list.add("Dafne");

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		System.out.println("Index of: " + list.indexOf("Leila"));
		System.out.println("Index of: " + list.indexOf("Dafne"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		System.out.println("---------------------------");
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);

	}

}
