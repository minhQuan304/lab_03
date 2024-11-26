package Aims;

public class DigitalVideoDisc {

	private static int nbDigitalVideoDiscs = 0;

	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	public int getId() {
		return id;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}

	@Override
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
	}

}
