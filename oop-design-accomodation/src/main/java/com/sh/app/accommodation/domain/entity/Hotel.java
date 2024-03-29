package com.sh.app.accommodation.domain.entity;


import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public class Hotel extends AbstractAccommodationRoot {
    private Long id;
    private String name;
    private Region region;
    private String description;
    private Address address;
}
