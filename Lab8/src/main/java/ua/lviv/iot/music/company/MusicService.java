package ua.lviv.iot.music.company;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import ua.lviv.iot.music.model.MusicalInstrument;
import ua.lviv.iot.music.persistence.dao.MusicalInstrumentDao;

public class MusicService {

	private static Map<Integer, MusicalInstrument> instruments = new HashMap<Integer, MusicalInstrument>();
	
	public MusicalInstrument create(MusicalInstrument instrument) {
		//instrument.setId(max++);
		instruments.put(instrument.getId(), instrument);
		return instrument;
	}

	public Collection<MusicalInstrument> getAll() {
		return instruments.values();
	}

	public MusicalInstrument get(Integer id) {
		return instruments.get(id);
	}

	public Map<Integer, MusicalInstrument> getMap(){
		return instruments;
	}

	public void delete(Integer id) {
		instruments.remove(id);
	}

	public MusicalInstrument update(Integer id, MusicalInstrument instrument) {
		if (instruments.containsKey(id) && id.equals(instrument.getId()))
			instruments.put(id, instrument);
		return get(id);
	}

}
