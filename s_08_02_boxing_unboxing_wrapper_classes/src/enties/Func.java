package enties;

public class Func {
	private Integer id;
	private String name;
	private Double salario;

	public Func() {

	}

	public Func(Integer id) {
		this.id = id;
	}

	public Func(Integer id, String name) {
		this.id = id;
		this.name = name;

	}

	public Func(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void  increaseSalary(Double percentage) {
		salario += salario * percentage/100;
	}

	@Override
	public String toString() {
		return  id 
				+ ", " 
				+ name + ", " 
				+ String.format("%.2f", salario);
	}
	
	
	

}
