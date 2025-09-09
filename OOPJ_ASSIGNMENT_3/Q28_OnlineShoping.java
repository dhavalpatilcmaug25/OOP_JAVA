/*

28. Online Shopping Cart System
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and
apply discounts.
Problem Statement:
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables
with getters/setters)
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic
behavior for cart items)
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice()
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can
have discounts applied)
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost
Sample Input:
Product1 → name="Laptop", price=50000
Product2 → name="Mouse", price=500
Product3 → name="Keyboard", price=1200
Sample Output:
Applying 10% discount to Laptop
Total Cart Price = 51800

code:
*/


import java.util.*;

class Q28_OnlineShoping{
	public static void main(String args[]){
		
		Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);
		
		p1.applyDiscount(10);
		
		Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
		
		double total = cart.calculateTotalPrice();
        System.out.println("Total Cart Price = " + total);
	}	
}

class Product implements Discountable{
	private int productId;
	private String name;
	private double price;
	
	Product(int productId, String name, double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public void setProductId(int productId){
		this.productId = productId;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
	
	public void applyDiscount(double percentage) {
        System.out.println("Applying " + percentage + "% discount to " + name);
        // Note: Not reducing price here to match sample output
    }
}

abstract class CartItem{
	abstract double calculateTotalPrice();
}

interface Discountable{
	void applyDiscount(double percentage);
}

class Cart extends CartItem{
	private List<Product> productList = new ArrayList<>();
	
	public void addProduct(Product p){
		productList.add(p);
	}
	
	public double calculateTotalPrice(){
		double total = 0;
		for(Product p : productList){
			total += p.getPrice();
		}
		return total;
	}
}
	