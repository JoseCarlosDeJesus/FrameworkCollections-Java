package br.com.pc3.semana1;

public class Aluno implements Comparable<Aluno>{
	private String matricula;
	private String nome;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Matrícula: "+matricula+"\n"+"Nome: "+nome;
	}
	@Override
	public int compareTo(Aluno aluno) {
		return this.nome.compareTo(aluno.nome);
	}

}
