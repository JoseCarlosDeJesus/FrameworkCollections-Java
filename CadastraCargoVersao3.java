package br.com.prog3.aula1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CadastraCargoVersao3 {

	public static void main(String[] args) {
		List<Cargo> cargos = retornaListaDeCargos();
		for(Cargo c : cargos) {
			System.out.println(c);
		}

	}
	
	public static List<Cargo> retornaListaDeCargos(){
		Cargo c1 = new Cargo();
		Cargo c2 = new Cargo();
		Cargo c3 = new Cargo();
		Cargo c4 = new Cargo();
		
		c1.setCodigo(1);
		c1.setDescricao("Professor");
		c1.setSalario(4000.00);
		
		c2.setCodigo(2);
		c2.setDescricao("Eletrecista");
		c2.setSalario(2200.00);
		
		c3.setCodigo(3);
		c3.setDescricao("Administrador");
		c3.setSalario(5000.00);
		
		c4.setCodigo(4);
		c4.setDescricao("Advogado");
		c4.setSalario(6000.00);

		List<Cargo> cargos = new LinkedList<>();
		cargos.add(c1);
		cargos.add(c2);
		cargos.add(c3);
		cargos.add(c4);
		
		return cargos;
	}

}
