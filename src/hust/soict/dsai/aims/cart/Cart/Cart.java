package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	private ArrayList<DigitalVideoDisc> items;
	private int qtyOrdered;
	private final int MAX_NUM_ORDERED = 20;

	public Cart() {
		items = new ArrayList<>();
		qtyOrdered = 0;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUM_ORDERED) {
			System.out.println("The cart is full.");
		} else {
			items.add(disc);
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			DigitalVideoDisc disc = dvdList[i];
			if (qtyOrdered == MAX_NUM_ORDERED) {
				System.out.println("The cart is full.");
				break;
			}
			items.add(disc);
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (items.remove(disc)) {
			qtyOrdered--;
			System.out.println("The disc has been removed.");
		} else {
			System.out.println("The disc is not found in the cart.");
		}
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < items.size(); i++) {
			DigitalVideoDisc disc = items.get(i);
			total += disc.getCost();
		}
		return total;
	}

	public void printCartDetails() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i = 0; i < items.size(); i++) {
			DigitalVideoDisc disc = items.get(i);
			System.out.println((i + 1) + ". " + disc.toString()); // Use toString() of DVD
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}

	public void searchById(int id) {
		boolean found = false;
		for (DigitalVideoDisc disc : items) {
			if (disc.getId() == id) {
				System.out.println("Found DVD: " + disc.toString());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No DVD found with ID: " + id);
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (DigitalVideoDisc disc : items) {
			if (disc.isMatch(title)) {
				System.out.println("Found DVD: " + disc.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No DVD found with title: " + title);
		}
	}
}