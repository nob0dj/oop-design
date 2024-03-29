package com.sh.app.accommodation.domain.entity;

import lombok.Data;

@Data
public class Address {
    private String zipCode;
    private String country;
    private String city;
    private String state;
    private String address;
}
