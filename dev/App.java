package dev;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         System.out.println("오늘 뭐 먹지?");

        Menu menu = new MenuImpl();
        ArrayList<String> items = menu.printMenu();
        int age = menu.inputNum();
        menu.enterMenu(age, items);

        // // 메뉴 작성
        // String[] menu ={"김밥","떡볶이"};
        // // System.out.println(menu);
        // // 메뉴를 출력
        // for (int i = 0; i < menu.length; i++) {

        // System.out.println(menu[i]);
        // }
        // // 사용자에게 입력받고
        // // 메뉴 선택
        // String s = sc.nextLine();
        // System.out.println("메뉴 : " + s);
        // // 아무거나 선택 기능(AI)
        // // 선택된 메뉴 출력

        // if()

        // 수업 답

        // 메뉴작성
        // String[] items = {"돈까스","국밥","칼국수","치킨","김밥"};
        // //메뉴출력
        // // System.out.println("1."+ items[0]);
        // // System.out.println("2." +items[1]);
        // // System.out.println("3."+items[2]);
        // // System.out.println("4."+items[3]);
        // // System.out.println("5."+items[4]);
        // // System.out.println("6.아무거나");

        // for (int i = 0; i < items.length; i++) {
        // System.out.println(i+1 +". "+items[i]);
        // }
        // System.out.println("6. 아무거나");

        // // 사용자에게 입력받고
        // System.out.print("입력하세요: ");
        // int age = sc.nextInt();
        // // 만약에 1번을 누르면 선택된 메뉴가 출력
        // if(age==1){
        // System.out.println("1. 돈까스를 선택 했습니다.");
        // System.out.println("맛있게 드세요");
        // }
        // // 만약에 2번을 누르면 선택된 메뉴가 출력
        // if(age==2){
        // System.out.println("2. 국밥을 선택 했습니다.");
        // System.out.println("맛있게 드세요");
        // }
        // // 아무거나 선택 기능(AI)
        // //만약에 6번을 누르면 AI가 추천해주는 메뉴를 출력
        // if(age==6){
        // Random random = new Random();
        // int rNum = random.nextInt(items.length);
        // System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로 ");
        // System.out.println("추천된 메뉴 "+items[rNum]+"입니다");
        // System.out.println("맛있게 드세요");
        // }

    }
}
