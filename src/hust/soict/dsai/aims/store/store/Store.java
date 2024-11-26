package hust.soict.dsai.aims.store.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore;

	public Store() {
		itemsInStore = new ArrayList<>();
	}

	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore.add(disc);
		System.out.println("DVD '" + disc.getTitle() + "' has been added to the store.");
	}

	public void removeDVD(DigitalVideoDisc disc) {
		if (itemsInStore.remove(disc)) {
			System.out.println("DVD '" + disc.getTitle() + "' has been removed from the store.");
		} else {
			System.out.println("DVD '" + disc.getTitle() + "' is not found in the store.");
		}
	}

	public void printStoreDetails() {
		System.out.println("***********************STORE***********************");
		System.out.println("DVDs in Store: ");
		if (itemsInStore.isEmpty()) {
			System.out.println("No DVDs available in the store.");
		} else {
			for (int i = 0; i < itemsInStore.size(); i++) {
				DigitalVideoDisc disc = itemsInStore.get(i);
				System.out.println((i + 1) + ". " + disc.toString());
			}
		}
		System.out.println("***************************************************");
	}
}
