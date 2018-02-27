package ua.politechnika.iot;

public final class StringType extends MusicalInstrument {

	private final TypeInstrument instrumentType = TypeInstrument.STRING;
	private int countOfString;

	public StringType(String name, String countryFrom, double price, String guarantee, int weight, int countOfString) {
		setName(name);
		setCountryFrom(countryFrom);
		setPrice(price);
		setGuarantee(guarantee);
		setWeight(weight);
	}

	@Override
	public String toString() {
		return "\nName:.." + name + "\nCountry from:.." + countryFrom + "\nPrice of instrument:.." + price
				+ "\nGuarantee:.." + guarantee + "\nWeight:.." + weight + "\nCountOfString" + (countOfString);
	}

	public void setCountOfString(int countOfString) {
		this.countOfString = countOfString;
	}

	public int getCountOfString(int countOfString) {
		return countOfString;
	}

	@Override
	public TypeInstrument getTypeInstruments() {
		return instrumentType;
	}

}
