package view;

import model.Funcionario;

public class Principal {
	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		f.setNome("Wallace");
		f.setCargo("Estagiário");
		f.setSalario(800);

		String nome = f.getNome();
		String cargo = f.getCargo();
		double salario = f.getSalario();
		double desconto = salario* 0.10;
		double beneficio = salario * 0.05;

		System.out.println(nome);
		System.out.println(cargo);
		System.out.println(salario);
		System.out.println(desconto);
		System.out.println(beneficio);

		f.getSalarioLiquido(desconto, beneficio);

	}
}
