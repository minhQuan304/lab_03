package Aims;

public class Aims {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 120, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Cinderella", "Animation", "Clyde Geronimi", 85, 15.95f);

		// Create a Cart
		Cart anOrder = new Cart();

		// Add DVDs to the cart
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

		// Print Cart details
		anOrder.printCartDetails(); // This will print the cart details

		// Remove a DVD and print the cart again
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.printCartDetails(); // This will print the updated cart details
	}

}