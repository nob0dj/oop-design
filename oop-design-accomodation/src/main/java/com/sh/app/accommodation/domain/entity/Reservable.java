package com.sh.app.accommodation.domain.entity;

/**
 * <pre>
 * 에약 가능한 대상으로써 숙박시설 인터페이스
 * - 호텔의 방, 펜션의 방 또는 게스트하우스(방포함) 등
 * </pre>
 */
public interface Reservable {
    Integer getPrice();
}
