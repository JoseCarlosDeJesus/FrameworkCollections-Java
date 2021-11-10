package br.com.prog3.semana1;

import java.util.HashMap;
import java.util.Map;

public class MapaEndereco {

	public static void main(String[] args) {
		Endereco end1 = new Endereco(4, "Rua A", 12, "71900-800");
		Endereco end2 = new Endereco(2, "Rua B", 16, "71900-300");
		Endereco end3 = new Endereco(1, "Rua C", 19, "71900-200");
		Endereco end4 = new Endereco(3, "Rua D", 456, "71900-700");
		Endereco end5 = new Endereco(3, "Rua F", 49, "71900-800");
		
		Map<Integer, Endereco> enderecos = new HashMap<Integer, Endereco>();
		
		enderecos.put(end1.getCodigo(), end1);
		enderecos.put(end2.getCodigo(), end2);
		enderecos.put(end3.getCodigo(), end3);
		enderecos.put(end4.getCodigo(), end4);
		enderecos.put(end5.getCodigo(), end5);
		
		for(Integer chave : enderecos.keySet()) {
			System.out.println(enderecos.get(chave));
		}

	}

}
