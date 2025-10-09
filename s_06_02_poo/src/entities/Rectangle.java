package entities;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return    String.format("AREA = %.2f%n", area())
				+ String.format("PERIMETRO = %.2f%n",perimeter())
				+ String.format("DIAGONAL = %.2f%n", diagonal());
	}

}
