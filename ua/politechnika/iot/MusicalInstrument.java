package ua.politechnika.iot;

public abstract class MusicalInstrument {

	protected String name;
	protected String countryFrom;
	protected double price;
	protected String guarantee;
	protected int weight;

	public abstract TypeInstrument getTypeInstruments();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}

	public String getCountryFrom() {
		return countryFrom;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

}
