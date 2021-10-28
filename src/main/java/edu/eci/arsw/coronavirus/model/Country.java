package edu.eci.arsw.coronavirus.model;

public class Country {

    private City city;
    private Province province;
    private Integer deaths;
    private Integer confirmed;
    private Integer recovered;
    private String keyId;
    private String name;

    public Country(City city, Province province, String keyId, Integer confirmed, Integer deaths, Integer recovered,
            String name) {
        setCity(city);
        setProvince(province);
        setKeyId(keyId);
        setConfirmed(confirmed);
        setDeaths(deaths);
        setRecovered(recovered);
        setName(name);
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
