package com.inventory.inventory.persistence.entity.proveedor;

/**
 * Created by LuisCO on 7/01/2018.
 */
public class Proveedor {

    private String name;
    private String contactName;
    private String email;
    private String phone;
    private String address;
    private String website;

    public Proveedor() {
    }

    public Proveedor(String name, String contactName, String email, String phone, String address, String website) {
        this.name = name;
        this.contactName = contactName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
