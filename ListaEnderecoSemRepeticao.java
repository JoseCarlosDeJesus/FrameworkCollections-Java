package br.com.prog3.semana1;

import java.util.HashSet;
import java.util.Set;

public class ListaEnderecoSemRepeticao {

	public static void main(String[] args) {
		Set<Endereco> enderecos = new HashSet<Endereco>();
		Endereco end1 = new Endereco(4, "Rua A", 12, "71900-800");
		Endereco end2 = new Endereco(2, "Rua B", 16, "71900-300");
		Endereco end3 = new Endereco(1, "Rua C", 19, "71900-200");
		Endereco end4 = new Endereco(3, "Rua D", 456, "71900-700");
		Endereco end5 = new Endereco(3, "Rua F", 49, "71900-800");
		
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
