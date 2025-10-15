package entities;

public class DadosPessoas {
	private Double altura;
	private String sexo;
	private static Double soma = 0.0;

	public DadosPessoas() {

	}

	public DadosPessoas(Double altura, String sexo) {
		this.altura = altura;
		this.sexo = sexo;
		soma(altura, sexo);
	}

	public Double getAltura() {
		return altura;
	}

	public String getSexo() {
		return sexo;
	}

	public Double getSoma() {
		return soma;
	}

	public void soma(double altura, String sexo) {
		if (sexo.charAt(0) == 'F') {
			soma += altura;
		}

	}

}
