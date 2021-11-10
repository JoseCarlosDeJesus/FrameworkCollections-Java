package br.com.prog3.aula1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet3 {

	public static void main(String[] args) {
		Set<String> listaCursos = new LinkedHashSet<>();
		listaCursos.add("Ciência da Computação");
		listaCursos.add("Licenciatura em Física");
		listaCursos.add("Licenciatura em Química");
		//listaCursos.add("Eletromecânica");
		listaCursos.add("Ciência da Computação");

		Iterator<String> it = listaCursos.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(listaCursos.contains("Licenciatura em Física"));
		System.out.println(listaCursos.contains("Eletromecânica"));
		System.out.println(listaCursos.size());
		listaCursos.clear();
		System.out.println(listaCursos.size());

		/*
		 * for (String s : listaCursos) { System.out.println(s); }
		 */
	}

}
