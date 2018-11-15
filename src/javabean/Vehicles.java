package javabean;

/**
 *
 * Vehicles class declaration and implementation
 *
 * @author Dorian Harusha
 * @date 11.11.2018
 * @version 1.0
 *
 */

public class Vehicles {
    private int id;
    private String vin;
    private String brand;
    private String model;
    private String year;
    private String kilometers;
    private int workorders;

    public Vehicles() {

    }

    /**
     *
     * @param vin
     * @param brand
     * @param model
     * @param year
     * @param kilometers
     * @param workorders
     */
    public Vehicles(String vin, String brand, String model, String year, String kilometers, int workorders) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.kilometers = kilometers;
        this.workorders = workorders;
    }

    /**
     *
     * @param id
     * @param vin
     * @param brand
     * @param model
     * @param year
     * @param kilometers
     * @param workorders
     */
    public Vehicles(int id, String vin, String brand, String model, String year, String kilometers, int workorders) {
        this.id = id;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.kilometers = kilometers;
        this.workorders = workorders;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return vin
     */
    public String getVin() {
        return vin;
    }

    /**
     *
     * @param vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     *
     * @return kilometers
     */
    public String getKilometers() {
        return kilometers;
    }

    /**
     *
     * @param kilometers
     */
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    /**
     *
     * @return workorders
     */
    public int getWorkorders() {
        return workorders;
    }

    /**
     *
     * @param workorders
     */
    public void setWorkorders(int workorders) {
        this.workorders = workorders;
    }
}
