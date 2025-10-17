package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private Integer quantity;
	private Double price;

	List<Product> products = new ArrayList<>();

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);

	}

	public void removeProduct(Product product) {
		products.remove(product);

	}

	public Double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		StringBuilder bd = new StringBuilder();

		for (Product product : products) {
			bd.append(product.getName() + ", ");
			bd.append(String.format("$%.2f",product.getPrice()) + ", ");
		}
		bd.append("Quantity: " + quantity + ", ");
		bd.append(String.format("Subtotal: $%.2f", subTotal()) + "\n");
		return bd.toString();
	}

}
