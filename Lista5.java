package br.com.pc3.semana1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista5 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Carla");
		nomes.add("Catarina");
		nomes.add("Bianca");
		
		for(String s : nomes) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Collections.sort(nomes);
		for(String s : nomes) {
			System.out.println(s);
		}

	}

}
