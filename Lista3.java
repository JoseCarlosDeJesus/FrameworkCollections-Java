package br.com.pc3.semana1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista3 {

	public static void main(String[] args) {
		List<Aluno> lista = new ArrayList<Aluno>();
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setMatricula("12");
		a1.setNome("Maria");
		
		a2.setMatricula("13");
		a2.setNome("João");
		
		a3.setMatricula("14");
		a3.setNome("Sandra");
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		for(Aluno a : lista) {
			System.out.println(a);
		}
		System.out.println();
		Collections.sort(lista);
		for(Aluno a : lista) {
			System.out.println(a);
		}


	}

}
