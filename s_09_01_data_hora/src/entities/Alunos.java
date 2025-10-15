package entities;

public class Alunos {
	private String name;
	private Double nota1;
	private Double nota2;
	private Double media;

	public Alunos() {

	}

	public Alunos(String name, Double nota1, Double nota2) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		calcMedia(nota1, nota2);
	}

	public String getName() {
		return name;
	}

	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public Double getmedia() {
		return media;
	}

	public void calcMedia(Double n1, Double n2) {
		this.media = (n1 + n2) / 2;
	}

}
