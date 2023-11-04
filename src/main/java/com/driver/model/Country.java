package com.driver.model;// Note: Do not write @Enumerated annotation above CountryName in this model.

import javax.persistence.*;

@Entity
@Table(name = "country")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private CountryName name;
    private String code;
    @JoinColumn
    @OneToOne
    private User user;
    @JoinColumn
    @ManyToOne
    private ServiceProvider serviceProvider;

    public Country() {
    }

    public Country(Integer id, CountryName name, String code, User user, ServiceProvider serviceProvider) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CountryName getName() {
        return name;
    }

    public void setName(CountryName name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}