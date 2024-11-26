package Aims;

public class Aims {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 120, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Cinderella", "Animation", "Clyde Geronimi", 85, 15.95f);

		Cart anOrder = new Cart();

		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

		anOrder.printCartDetails();

		anOrder.searchById(2);
		anOrder.searchById(5);

		anOrder.searchByTitle("Star wars");
		anOrder.searchByTitle("Frozen");
	}

}