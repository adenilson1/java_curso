package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment = new Date();
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}


	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double total = 0.0;
		for (OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() 
		                     + " ("
				             + sdf2.format(client.getBirthDate())
				             + ")"
				             + " - "
				             + client.getEmail() 
				             + "\n");
		sb.append("Order items: \n");
		for (OrderItem item : items) {
			sb.append(item.getProduct().getName() + ", ");
			sb.append(String.format("$%.2f", item.getProduct().getPrice()) + ", ");
			sb.append("Quantity: " + item.getQuantity() + ", ");
			sb.append(String.format("Subtotal: $%.2f%n",item.subTotal()));
		}
		sb.append(String.format("Total price: $%.2f",total()));
		
		return sb.toString();
	}
	
	
	

}
