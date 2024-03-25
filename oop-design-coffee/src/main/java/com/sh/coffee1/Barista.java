package com.sh.coffee1;

/**
 * <pre>
 * Barista 수신메세지 목록
 * - 주문에 따라 커피를 만들어라 (커피를 제공)
 * </pre>
 */
public class Barista {
    private int coffeeStock = 5000; // 5000g 커피 보유
    public Coffee[] makeCoffee(Order order) {
        // 재고차감 처리 - 커피한잔에 20g씩 사용
        
        // 커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];
        for (int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());
        }
        return coffees;
    }
}
