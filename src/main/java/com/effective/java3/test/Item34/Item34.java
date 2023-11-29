package com.effective.java3.test.Item34;

/**
 * JAVA의 열거 타입은 완전한  형태의 클래스
 * 상수 하나당 자신의 인스턴스를 하나씩 만들어 public static final 필드로 공개한다.
 * 필요한 원소를 컴파일타임에 다 알 수 있는 상수 집합이라면 항상 열거 타입을 사용하자
 * */
public class Item34 {
    public enum Apple {FUJI, PIPPIN, GRANNY_SMITH}
    public enum Orange { NAVEL, TEMPLE, BLOOD }
}
