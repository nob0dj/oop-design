package com.sh.app.accommodation.domain.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * <pre>
 * 에약 가능한 대상으로써 숙박시설 추상클래스
 * - 호텔의 방, 펜션의 방 또는 게스트하우스(방포함) 등
 * - 숙박시설루트를 가지고 있다.
 * - 예약 가능한 숙박시설 루트는 AbstractReservableAccommodationRoot클래스를 사용한다.
 * </pre>
 */
@Data
@SuperBuilder
public abstract class AbstractAccommodation implements Reservable {
    private Long id; // 식별번호 - 전체숙박시설에서 유일해야 한다.
    private AbstractAccommodationRoot accomodationRoot;
    private String name; // 식별명 - 손님도 구분가능한 이름. 303호, 해돋이방...
    private Integer price;
    private boolean enabled;
}
