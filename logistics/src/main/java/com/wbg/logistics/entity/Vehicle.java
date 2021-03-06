package com.wbg.logistics.entity;

public class Vehicle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.license
     *
     * @mbg.generated
     */
    private String license;


    private Depart depart;

    public Vehicle() {
    }

    public Vehicle(String license, Depart depart, String vType, Integer vload, Integer staffNo) {
        this.license = license;
        this.depart = depart;
        this.vType = vType;
        this.vload = vload;
        this.staffNo = staffNo;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.v_type
     *
     * @mbg.generated
     */
    private String vType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.vload
     *
     * @mbg.generated
     */
    private Integer vload;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicle.staff_no
     *
     * @mbg.generated
     */
    private Integer staffNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.license
     *
     * @return the value of vehicle.license
     *
     * @mbg.generated
     */
    public String getLicense() {
        return license;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.license
     *
     * @param license the value for vehicle.license
     *
     * @mbg.generated
     */
    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.v_type
     *
     * @return the value of vehicle.v_type
     *
     * @mbg.generated
     */
    public String getvType() {
        return vType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.v_type
     *
     * @param vType the value for vehicle.v_type
     *
     * @mbg.generated
     */
    public void setvType(String vType) {
        this.vType = vType == null ? null : vType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.vload
     *
     * @return the value of vehicle.vload
     *
     * @mbg.generated
     */
    public Integer getVload() {
        return vload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.vload
     *
     * @param vload the value for vehicle.vload
     *
     * @mbg.generated
     */
    public void setVload(Integer vload) {
        this.vload = vload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicle.staff_no
     *
     * @return the value of vehicle.staff_no
     *
     * @mbg.generated
     */
    public Integer getStaffNo() {
        return staffNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicle.staff_no
     *
     * @param staffNo the value for vehicle.staff_no
     *
     * @mbg.generated
     */
    public void setStaffNo(Integer staffNo) {
        this.staffNo = staffNo;
    }
}