package br.com.prog3.semana1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaEndereco {

	public static void main(String[] args) {
		List<Endereco> enderecos = new ArrayList<Endereco>();
		Endereco end1 = new Endereco(4, "Rua A", 12, "71900-800");
		Endereco end2 = new Endereco(2, "Rua B", 16, "71900-300");
		Endereco end3 = new Endereco(1, "Rua C", 19, "71900-200");
		Endereco end4 = new Endereco(3, "Rua D", 456, "71900-700");
		Endereco end5 = new Endereco(3, "Rua F", 49, "71900-100");
		
		enderecos.add(end1);
		enderecos.add(end2);
		enderecos.add(end3);
		enderecos.add(end4);
		enderecos.add(end5);
		
		for(Endereco e : enderecos) {
			System.out.println(e);
		}

	}

}
