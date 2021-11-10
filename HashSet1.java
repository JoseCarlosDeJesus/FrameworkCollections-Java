package br.com.prog3.aula1;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Manoel");
		nomes.add("Bianca");
		nomes.add("Silvia");
		nomes.add("Maria");
		
		for(String s : nomes) {
			System.out.println(s);
		}

	}

}
