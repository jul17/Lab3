package ua.politechnika.iot;

public final class Wind extends MusicalInstrument {

	private final TypeInstrument instrumentType = TypeInstrument.WIND;
	private String lengthOfTube;

	public Wind(String name, String countryFrom, double price, String guarantee, int weight, String lengthOfTube) {
		setName(name);
		setCountryFrom(countryFrom);
		setPrice(price);
		setGuarantee(guarantee);
		setWeight(weight);
		setLengthOfTube(lengthOfTube);
	}

	@Override
	public String toString() {
		return "\nName:.." + name + "\nCountry from:.." + countryFrom + "\nPrice of instrument:.." + price
				+ "\nGuarantee:.." + guarantee + "\nWeight:.." + weight + "\n Length of tube:.." + lengthOfTube;
	}

	public String getLengthOfTube(String lengthOfTube) {
		return lengthOfTube;
	}

	public void setLengthOfTube(String lengthOfTube) {
		this.lengthOfTube = lengthOfTube;
	}

	@Override
	public TypeInstrument getTypeInstruments() {
		return instrumentType;
	}
}
