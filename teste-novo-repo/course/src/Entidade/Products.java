package Entidade;

public class Products {

	public String name;
	public double price;
	public int quantity;

	public double totalValuenStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ",  $ " + String.format("%.2f", price) + ", " + quantity + " units," + " Total: $ " +  String.format("%.2f",totalValuenStock());
	}
}
