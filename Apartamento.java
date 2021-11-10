package br.com.pc3.semana1;

public class Apartamento {
	private Integer codigo;
	private double area;
	private double numeroComodo;

	@Override
	public String toString() {
		return "Código: " + codigo + "\n" + "Área: " + area + "\n" + "Número de cômodos: " + numeroComodo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Apartamento) && 
				((Apartamento) obj).getCodigo().equals(this.codigo)) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getNumeroComodo() {
		return numeroComodo;
	}

	public void setNumeroComodo(double numeroComodo) {
		this.numeroComodo = numeroComodo;
	}

}
