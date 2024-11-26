package Aims;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		System.out.println("DVD 1 ID: " + dvd1.getId()); // In ra ID của DVD1
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println("DVD 2 ID: " + dvd2.getId()); // In ra ID của DVD2
		anOrder.addDigitalVideoDisc(dvd2);

		System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs()); // In ra tổng số DVD đã
																								// tạo
		System.out.println("Total cost = " + anOrder.totalCost());

		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total cost after removal = " + anOrder.totalCost());

	}

}