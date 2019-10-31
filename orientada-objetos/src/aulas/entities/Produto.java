package aulas.entities;

public class Produto {
	public String name;
	public double price;
	public int quantity;

	public Produto() {
	}

	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// geters and setters...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// Fim get and setters.

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", R$ " + price + ", " + quantity + " unidades, Total: R$ " + totalValueInStock();
	}
}
