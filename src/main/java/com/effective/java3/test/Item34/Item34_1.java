package com.effective.java3.test.Item34;

import org.springframework.web.util.pattern.PathPattern;

/**
 * 열거 타입 상수 각각을 특정 데이터와 연결지으려면 생성자에서 데이터를 받아 인스턴스 필드에 저장하면 된다
 * 열거 타입은 근본적으로 불변이라 모든 필드는 final이어야한다
 * */
public enum Item34_1 {
    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869, 6.052);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.67300E-11;

    Item34_1(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mass() {return mass;}

    public double getSurfaceWeight(double mass) {
        return mass * surfaceGravity;
    }


}
