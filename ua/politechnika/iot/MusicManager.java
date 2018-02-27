package ua.politechnika.iot;

import java.util.LinkedList;
import java.util.List;

public class MusicManager {

	private String address;
	private String shopName;
	private List<MusicalInstrument> instrumentList = new LinkedList<>();

	public MusicManager() {
	}

	public MusicManager(String address, String shopName, List<MusicalInstrument> instrumentList) {
		setAddress(address);
		setShopName(shopName);
		setInstrumentList(instrumentList);
	}

	public List<MusicalInstrument> findByType(TypeInstrument instrumentType) {
		List<MusicalInstrument> allInstrument = new LinkedList<>();

		instrumentList.stream().filter((instrumentList) -> ((instrumentList.getTypeInstruments() == instrumentType)))
				.forEachOrdered((instrumentList) -> {
					allInstrument.add(instrumentList);
				});

		return allInstrument;
	}

	public List<MusicalInstrument> sortByWeight(List<MusicalInstrument> result) {
		result.sort((MusicalInstrument m1, MusicalInstrument m2) -> m2.getWeight() - m1.getWeight());
		return result;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<MusicalInstrument> getInstrumentList() {
		return instrumentList;
	}

	public void setInstrumentList(List<MusicalInstrument> instrumentList) {
		this.instrumentList = instrumentList;
	}

	public void addMusicalInstrument(MusicalInstrument MusicalInstrument) {
		this.instrumentList.add(MusicalInstrument);
	}
}
