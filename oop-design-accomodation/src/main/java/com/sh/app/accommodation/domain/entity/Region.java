package com.sh.app.accommodation.domain.entity;

/**
 * <a href="https://sgis.kostat.go.kr/developer/html/openApi/api/dataCode/SidoCode.html">통계지리정보서비스 - 시도 코드표</a>
 */
public enum Region {
    서울특별시(11),
    부산광역시(21),
    대구광역시(22),
    인천광역시(23),
    광주광역시(24),
    대전광역시(25),
    울산광역시(26),
    세종특별자치시(29),
    경기도(31),
    강원도(32),
    충청북도(33),
    충청남도(34),
    전라북도(35),
    전라남도(36),
    경상북도(37),
    경상남도(38),
    제주특별자치도(39);

    private int value;

    Region(int value){
        this.value = value;
    }

    public static Region valueOf(int value) {
        return switch (value) {
            case 11 -> 서울특별시;
            case 21 -> 부산광역시;
            case 22 -> 대구광역시;
            case 23 -> 인천광역시;
            case 24 -> 광주광역시;
            case 25 -> 대전광역시;
            case 26 -> 울산광역시;
            case 29 -> 세종특별자치시;
            case 31 -> 경기도;
            case 32 -> 강원도;
            case 33 -> 충청북도;
            case 34 -> 충청남도;
            case 35 -> 전라북도;
            case 36 -> 전라남도;
            case 37 -> 경상북도;
            case 38 -> 경상남도;
            case 39 -> 제주특별자치도;
            default -> throw new AssertionError(value);
        };
    }
}
