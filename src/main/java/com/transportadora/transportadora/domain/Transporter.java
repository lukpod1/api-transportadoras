package com.transportadora.transportadora.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
public class Transporter implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message = "company is mandatory")
    private String company;

    @NotBlank(message = "phone is mandatory")
    private String phone;

    @NotBlank(message = "modal is mandatory")
    private String modal;

    @NotBlank(message = "street is mandatory")
    private String street;

    @NotBlank(message = "number is mandatory")
    private String number;

    @NotBlank(message = "neighbourhood is mandatory")
    private String neighbourhood;

    @NotBlank(message = "city is mandatory")
    private String city;

    @NotBlank(message = "uf is mandatory")
    private String uf;

    public Transporter() {

    }

    public Transporter(Integer id, String email, String name, String company, String phone, String modal, String street, String number, String neighbourhood, String city, String uf) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.company = company;
        this.phone = phone;
        this.modal = modal;
        this.street = street;
        this.number = number;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
