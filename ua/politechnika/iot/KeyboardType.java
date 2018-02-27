package ua.politechnika.iot;

public final class KeyboardType extends MusicalInstrument {

	private final TypeInstrument instrumentType = TypeInstrument.KEYBOARD;
	private int countOfKeys;

	public KeyboardType(String name, String countryFrom, double price, String guarantee, int weight, int countOfKeys) {
		setName(name);
		setCountryFrom(countryFrom);
		setPrice(price);
		setGuarantee(guarantee);
		setWeight(weight);
		setCountOfKeys(countOfKeys);
	}

	@Override
	public String toString() {
		return "\nName:.." + name + "\nCountry from:.." + countryFrom + "\nPrice of instrument:.." + price
				+ "\nGuarantee:.." + guarantee + "\nWeight:.." + weight + "\nCountOfKeys:.." + countOfKeys;
	}

	public void setCountOfKeys(int countOfKeys) {
		this.countOfKeys = countOfKeys;
	}

	public int getCountOfKeys(int countOfKeys) {
		return countOfKeys;
	}

	@Override
	public TypeInstrument getTypeInstruments() {
		return instrumentType;
	}
}
