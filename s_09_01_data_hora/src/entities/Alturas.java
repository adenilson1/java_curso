package entities;

public class Alturas {

	private String name;
	private Integer idade;
	private Double altura;

	public Alturas() {

	}

	public Alturas(String name, Integer idade, Double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

}
