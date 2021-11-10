package br.com.pc3.semana1;

public class Funcionario implements Comparable<Funcionario> {
	private Integer matricula;
	private String nome;
	private Double salario;

	public void bonus(double percentual) {
		this.salario = salario * (1 + percentual / 100);
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Matrícula: " + matricula + "\n" + "Nome: " + nome + "\n" + "Salário: " + salario;
	}

	@Override
	public int compareTo(Funcionario func) {
		/*
		 * if (this.matricula < func.matricula) { return -1; } if (this.matricula >
		 * func.matricula) { return 1; } return 0;
		 */
		return this.nome.compareTo(func.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Funcionario) && 
				((Funcionario) obj).getMatricula().equals(this.matricula)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return matricula;
	}

}