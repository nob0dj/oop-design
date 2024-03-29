package com.sh.app.accommodation.domain.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoomTest {

    @DisplayName("숙박업소와 예약가능한 숙소 정보를 생성할 수 있습니다.")
    @Test
    public void test() throws Exception {
        Hotel hotel = Hotel.builder().id(1L).name("장미호텔").region(Region.서울특별시).build();
        Room room315 = Room.builder().id(101L).name("315").price(55_000).accomodationRoot(hotel).build();
        Room room205 = Room.builder().id(102L).name("205").price(55_000).accomodationRoot(hotel).build();
        Room room101 = Room.builder().id(103L).name("101").price(45_000).accomodationRoot(hotel).build();

        System.out.println(room315);
        System.out.println(room205);
        System.out.println(room101);

        assertThat(room315.getPrice()).isNotNull().isNotZero();
        assertThat(room205.getPrice()).isNotNull().isNotZero();
        assertThat(room101.getPrice()).isNotNull().isNotZero();

    }

}