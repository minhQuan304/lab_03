package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 120, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Cinderella", "Animation", "Clyde Geronimi", 85, 15.95f);

		Store myStore = new Store();

		myStore.addDVD(dvd1);
		myStore.addDVD(dvd2);
		myStore.addDVD(dvd3);

		myStore.printStoreDetails();

		myStore.removeDVD(dvd2);

		myStore.printStoreDetails();

		myStore.removeDVD(dvd2);
	}

}
