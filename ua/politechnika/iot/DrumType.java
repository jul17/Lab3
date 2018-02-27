package ua.politechnika.iot;

public final class DrumType extends MusicalInstrument {

	private final TypeInstrument instrumentType = TypeInstrument.DRUM;
	private int size;

	public DrumType(String name, String countryFrom, double price, String guarantee, int weight, int size) {
		setName(name);
		setCountryFrom(countryFrom);
		setPrice(price);
		setGuarantee(guarantee);
		setWeight(weight);
		setSize(size);
	}

	@Override
	public String toString() {
		return "Name:.." + name + "\nCountry from:.." + countryFrom + "\nPrice of instrument:.." + price
				+ "\nGuarantee:.." + guarantee + "\nWeight:.." + weight + "\nSize:.." + size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize(int size) {
		return size;
	}

	@Override
	public TypeInstrument getTypeInstruments() {
		return instrumentType;
	}

}
