package br.com.prog3.aula1;

public class Cargo {
	private Integer codigo;
	private String descricao;
	private Double salario;
	
	public String toString() {
		return "Código: "+codigo+"\n"+"Descrição: "+descricao+
				"\n"+"Salário: "+salario;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
