package com.sh.coffee1;

public class Coffee {
    private final String coffeeName;
    private final String option;

    public Coffee(String coffeeName, String option) {
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    /**
     * toString메소드를 사용하면, 객체를 문자열로 표현해야 할때 자동으로 호출된다.
     * 보통 필드의 내용을 확인할때 사용한다.
     * @return
     */
    public String toString() {
        return "%s(%s)".formatted(coffeeName, option);
    }
}
