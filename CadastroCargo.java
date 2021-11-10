package br.com.prog3.aula1;

import java.util.ArrayList;

public class CadastroCargo {

	public static void main(String[] args) {
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

		ArrayList cargos = new ArrayList();
		cargos.add(c1);
		cargos.add(c2);
		cargos.add(c3);
		cargos.add(c4);
		cargos.add(8988.90);
		
		for(int i = 0; i < cargos.size(); i++) {
			Cargo c = (Cargo)cargos.get(i);
			System.out.println(c.getDescricao());
		}

		

	}

}
