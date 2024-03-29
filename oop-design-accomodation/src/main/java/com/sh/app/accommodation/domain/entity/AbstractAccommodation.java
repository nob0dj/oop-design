package com.sh.app.accommodation.domain.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class AbstractAccommodation implements Reservable {
    private Long id;
    private AbstractAccommodationRoot accomodationRoot;
    private String name; // 303호, 해돋이방...
    private Integer price;
    private boolean enabled;
}
