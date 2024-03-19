package model;

import java.text.DecimalFormat;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	private DecimalFormat df = new DecimalFormat("0.00");
	public Funcionario() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 1412) {
			this.salario = 1412;
		} else {
			this.salario = salario;
		}
	}

	public void getSalarioLiquido(double desconto, double beneficio) {
		double salarioLiquido = (salario - desconto) + beneficio;
		System.out.println("Salário líquido R$" + df.format(salarioLiquido));
	}

}
