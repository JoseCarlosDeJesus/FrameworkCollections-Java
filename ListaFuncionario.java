package br.com.prog3.aula1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaFuncionario {

	public static void main(String[] args) {
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.setMatricula(2);
		f1.setNome("Maria");
		f1.setSalario(4500.00);
		
		f2.setMatricula(3);
		f2.setNome("Carla");
		f2.setSalario(3500.00);
		
		f3.setMatricula(5);
		f3.setNome("Bianca");
		f3.setSalario(2500.00);
		
		listaFunc.add(f1);
		listaFunc.add(f2);
		listaFunc.add(f3);
		
		Collections.sort(listaFunc);
		for(Funcionario f : listaFunc) {
			System.out.println(f);
		}

	}

}
