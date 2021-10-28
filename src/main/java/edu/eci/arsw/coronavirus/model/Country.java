package edu.eci.arsw.coronavirus.model;

/**
 * @author Luis Amaya
 */
public class Country {

    private String city;
    private String province;
    private Integer deaths;
    private Integer confirmed;
    private Integer recovered;
    private String keyId;
    private String name;

    /**
     * 
     * @param city
     * @param province
     * @param keyId
     * @param confirmed
     * @param deaths
     * @param recovered
     * @param name
     */
    public Country(String city, String province, String keyId, Integer confirmed, Integer deaths, Integer recovered,
            String name) {
        setCity(city);
        setProvince(province);
        setKeyId(keyId);
        setConfirmed(confirmed);
        setDeaths(deaths);
        setRecovered(recovered);
        setName(name);
    }

    /**
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return Integer
     */
    public Integer getDeaths() {
        return deaths;
    }

    /**
     * @param deaths
     */
    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    /**
     * @return Integer
     */
    public Integer getConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed
     */
    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * @return Integer
     */
    public Integer getRecovered() {
        return recovered;
    }

    /**
     * @param recovered
     */
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    /**
     * @return String
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * @param keyId
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
