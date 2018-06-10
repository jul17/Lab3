package ua.lviv.iot.music.model;


import javax.persistence.*;

import ua.lviv.iot.music.company.TypeInstrument;

@Entity
@Table(name = "musical_instrument")
public class MusicalInstrument {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type_instruments")
    private TypeInstrument typeInstruments;

    @Column(name = "weight")
    private int weight;

    @Column(name = "country_from")
    private String countryFrom;

    @Column(name = "price")
    private double price;

    @Column(name = "guarantee")
    private String guarantee;

    public MusicalInstrument() {

    }

    public MusicalInstrument(String name, String countryFrom, double price, String guarantee, int weight) {
        this(null,name,countryFrom, price, guarantee, weight, null);
    }

    public MusicalInstrument(Integer id, String name, String countryFrom, double price, String guarantee, int weight, TypeInstrument instrument) {
        this.id = id;
        this.name = name;
        this.countryFrom = countryFrom;
        this.price = price;
        this.guarantee = guarantee;
        this.weight = weight;
        this.typeInstruments = instrument;
    }


    public final void setCountryFrom(final String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public final String getCountryFrom() {
        return countryFrom;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final double getPrice() {
        return price;
    }

    public void setGuarantee(final String guarantee) {
        this.guarantee = guarantee;
    }

    public final String getGuarantee() {
        return guarantee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeInstrument getTypeInstruments() {
        return typeInstruments;
    }

    public void setTypeInstruments(TypeInstrument typeInstruments) {
        this.typeInstruments = typeInstruments;
    }


    public String getHeaders() {
        return "ID, Name, CountryFrom, Guarantee, Weight, Type of instrument";
    }

    public String toCSV() {
        return id + "," +name + "," + countryFrom + "," + weight + "," + typeInstruments;
    }

}
