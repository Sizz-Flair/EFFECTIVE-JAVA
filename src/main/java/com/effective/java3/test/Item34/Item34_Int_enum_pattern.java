package com.effective.java3.test.Item34;


/**
 * 정수 열거 패턴
 *  - 상당히 취약하다
 *  - 타입 안전서을 보장할 방법이 없으며 표현력도 좋지 않다.
 *  - == 동등 연산자로 비교하더라도 컴파일러는 아무런 경고 메세지를 출력하지 않는다.
 *  - 값이 바뀌면 다시 컴파일 해야한다.
 * */
public class Item34_Int_enum_pattern {
    public static final int APPLE_FUJI =0;
    public static final int APPLE_GRANNY_SMITH =1;
    public static final int ORANGE_NAVEL = 0;
}
