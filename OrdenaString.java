package br.com.prog3.aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {
		List<String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Maria");
		listaNomes.add("Ana");
		listaNomes.add("Jaqueline");
		listaNomes.add("Bianca");
		listaNomes.add("Suzana");
		listaNomes.add("Carla");
		
		System.out.println("Antes de ordenar");
		for(String s : listaNomes) {
			System.out.println(s);
		}
		
		Collections.sort(listaNomes);
		System.out.println("Depois de ordenar");
		for(String s : listaNomes) {
			System.out.println(s);
		}

	}

}
