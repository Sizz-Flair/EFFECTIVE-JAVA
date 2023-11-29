package com.effective.java3.test.Item34;

/**
 * 이렇게 추상을 사용할 수 있다.
 * */
public enum Item34_2 {

    PLUS{public double apply(double x, double y) {return x+y;}},
    MINOR{public double apply(double x, double y) {return x+y;}};

    public abstract double apply(double x, double y);
}
