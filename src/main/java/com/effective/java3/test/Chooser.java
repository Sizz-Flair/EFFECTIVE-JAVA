package com.effective.java3.test;

import java.util.Collection;

public class Chooser<T> {

    private final T[] choiceArray;

    public Chooser(Collection<? extends T> choiceArray) {
        this.choiceArray = (T[])choiceArray.toArray();
    }
}
