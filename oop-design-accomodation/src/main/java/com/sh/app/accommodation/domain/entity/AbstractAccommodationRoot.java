package com.sh.app.accommodation.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * <pre>
 * 검색 단위를 제공하는 숙박시설 인터페이스
 * - 호텔, 모텔, 펜션, 게스트하우스(집 통째) 등
 * </pre>
 */
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractAccommodationRoot {
    private Long id;
    private String name;
    private Region region;
    private String description;
    private Address address;
}
