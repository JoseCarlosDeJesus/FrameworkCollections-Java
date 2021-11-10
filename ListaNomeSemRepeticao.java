package br.com.prog3.semana1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaNomeSemRepeticao {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Mônica");
		nomes.add("Cebolinha");
		nomes.add("Magali");
		nomes.add("Cascão");
		nomes.add("Magali");

		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes = new TreeSet<String>(nomes);
		System.out.println();
		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
