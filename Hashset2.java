package br.com.prog3.aula1;

import java.util.HashSet;
import java.util.Set;

public class Hashset2 {

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
		f4.setNome("sgsdfg");
		f4.setSalario(2500.00);
		
		Set<Funcionario> funcs = new HashSet<>();
		funcs.add(f1);
		funcs.add(f2);
		funcs.add(f3);
		funcs.add(f4);
		
		for(Funcionario f : funcs) {
			System.out.println(f);
		}

	}

}
