package entities;

public class DadosPessoas {

	private double altura;
	private char sexo;

	public DadosPessoas() {

	}

	public DadosPessoas(double altura, char sexo) {
		this.altura = altura;
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public char getSexo() {
		return sexo;
	}
	
}
