package br.com.prog3.aula1;

public class Processo {
	private Integer numero;
	private String classe;
	private String assunto;

	public String toString() {
		return "Número: " + numero + "\n" + "Classe: " + classe + "\n" + "Assunto: " + assunto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
