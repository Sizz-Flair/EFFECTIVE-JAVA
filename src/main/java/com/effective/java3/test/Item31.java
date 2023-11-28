package com.effective.java3.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Item31 {

    public static void swap(List<?> list, String a) {
        System.out.println(list.get(0));

        //가져오는건 가능하지만 삽입은 안됨 <?>
        list.add("ss");
    }

    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("data1");
        listString.add("data2");
        String a = "test";
        swap(listString, a);

        /** 제네릭 타입은 불공변이다
        * list 와 list2는 하위 또는 상위 관계도 아니다
        * */
        List<String> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();

        /**
         * 유연성을 위해 공변으로 변경은
         * <? extend E> -> 공변
         * <? Super E>   -> 반공변
         *
         * 아직 정확히 이해되지는 않았지만
         * extend는 생산자 또는 생산에 사용
         * super 소비하는 용도일떄 사용한다고 하는데..음
         *
         * 또한 클래스 사용자가 와일드카드 타입을 신경 써야 한다면 api무슨 문제가 있을 가능성이 크다..
           */

        Chooser<String> chooser = new Chooser<>(Arrays.asList());
        List<Integer> data = new ArrayList<>();
        Chooser<Number> chooser2 = new Chooser<>(data);

        /* 반환 타입에는 와일드카드를 사용하면 안된다
        * 유연성을 높여주기는 커녕 클라이언트코드에서도 와일드카드 타입을 써야하기 떄문이다 */
        
    }
}
