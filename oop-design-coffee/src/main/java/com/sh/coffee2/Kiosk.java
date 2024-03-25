package com.sh.coffee2;

public class Kiosk {

    private final Barista barista = new Barista();
    private final Menu[] menus = new Menu[2];
    public void menu() {
        Order order = null;

        while (true) {
            // 메뉴 제공

            // 커피 선택
            order = new Order();
//            order.setMenuName("아메리카노");
            // 온도타입 선택
//            order.setTemperatureType("HOT");
            // 수량 선택
//            order.setCount(2);

            // 주문서 발급 및 확인

            // 바리스타 커피 요청
            Coffee[] coffees = barista.makeCoffee(order);
        }

    }
}
