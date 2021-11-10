package br.com.prog3.aula1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaNome {

	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		String nome = "";
		do {
			nome = lerNome();
			if(!nome.equalsIgnoreCase("sair")) {
				nomes.add(nome);
			}
		}while(!nome.equalsIgnoreCase("sair"));
		
		System.out.println("Nomes digitados");
		if(nomes.size() > 0) {
			for(int i = 0; i < nomes.size(); i++) {
				System.out.println(nomes.get(i));
			}
		}

	}
	
	public static String lerNome() {
		String nome = JOptionPane.showInputDialog("Digite o nome "
				+ "(\"sair\" para encerrar)");
		return nome;
	}

}
