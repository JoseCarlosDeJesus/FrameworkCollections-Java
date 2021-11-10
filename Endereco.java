package br.com.prog3.semana1;

public class Endereco {
	private Integer codigo;
	private String logradouro;
	private Integer numero;
	private String cep;

	public Endereco(Integer codigo, String logradouro, Integer numero, String cep) {
		this.codigo = codigo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Código=" + codigo + ", Logradouro=" + logradouro + ", Número=" + numero + ", Cep=" + cep;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Endereco) && ((Endereco) obj).getCodigo().equals(this.codigo)) {
			return true;
		} else {
			return false;
		}

	}

	public int hashCode() {
		return codigo;
	}

}
