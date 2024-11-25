package Aims;

import java.util.ArrayList;

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
}