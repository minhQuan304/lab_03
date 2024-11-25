package Aims;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		System.out.println("totalCost = " + anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("totalCost = " + anOrder.totalCost());

	}

}