package br.com.pc3.semana1;

import java.util.HashSet;
import java.util.Set;

public class Conjunto2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.setMatricula("12");
		a1.setNome("Maria");
		
		a2.setMatricula("13");
		a2.setNome("João");
		
		a3.setMatricula("14");
		a3.setNome("Sandra");
		
		a4.setMatricula("14");
		a4.setNome("Sandra");
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		for(Aluno a : alunos) {
			System.out.println(a);
		}

	}

}
