package com.sh.car;

import java.util.Scanner;

public class CarMenu {
    private Scanner sc = new Scanner(System.in); // 전역변수
    // 운전자 객체 생성
    Driver driver = new Driver();

    public void menu() {

        
        // String block문법 (여러줄, 들여쓰기 표현가능)
        String menu = """
        =========================
            자동차운전 프로그램
        =========================
        1. 시동켜기
        2. 가속
        3. 감속
        4. 시동끄기
        0. 종료
        =========================
        입력 : """;
        
        while(true) {
            System.out.print(menu);
            String choice = sc.next();
            switch(choice) {
                case "1" : driver.startEngine(); break;
                case "2" : driver.accelerate(); break;
                case "3" : driver.brake(); break;
                case "4" : driver.stopEngine(); break;
                case "0" : return; // 현재메소드를 호출한 곳을 리턴
                default :
                    System.out.println("> 잘못 입력하셨습니다.");
            }
        }
    }
}
