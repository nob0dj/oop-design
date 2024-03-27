package com.sh.app.main.ui;


import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MainMenu {
    public static final Scanner sc = new java.util.Scanner(System.in);
    public void menu() {
        String menu = """
       
        ====================
            🏰에어비앤씨🏰
        ====================
        1. 숙박 예약
        2. 내 에약정보 보기
        0. 종료
        ====================
        입력 : """;

        while (true) {
            System.out.print(menu);
            String choice = sc.next();

            switch (choice) {
                case "1" -> {}
                case "2" -> {}
                case "0" -> {
                    return;
                }
                default -> {
                    System.out.println("> 잘못 입력하셨습니다.");
                }
            }
        }
    }
}
