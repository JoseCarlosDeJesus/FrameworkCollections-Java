package br.com.pc3.semana1;

import java.util.HashSet;
import java.util.Set;

public class ConjFunc1 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Funcionario f4 = new Funcionario();
		
		f1.setMatricula(2);
		f1.setNome("Maria");
		f1.setSalario(4500.00);
		
		f2.setMatricula(3);
		f2.setNome("Carla");
		f2.setSalario(3500.00);
		
		f3.setMatricula(5);
		f3.setNome("Bianca");
		f3.setSalario(2500.00);
		
		f4.setMatricula(5);
		f4.setNome("Bianca");
		f4.setSalario(2500.00);
		
		Set<Funcionario> set = new HashSet<Funcionario>();
		
		set.add(f1);
		set.add(f2);
		set.add(f3);
		set.add(f4);
		
		for(Funcionario f : set) {
			System.out.println(f);
		}

	}

}
