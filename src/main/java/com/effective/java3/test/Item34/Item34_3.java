package com.effective.java3.test.Item34;

public enum Item34_3 {

    GMP("GMP","GHKWN"),IN("GMP","GHKWN"),PY("GMP","GHKWN");

    private final String officeCode;
    private final String ageCode;

    Item34_3(String code, String code2) {
        this.officeCode = code;
        this.ageCode = code2;
    }

    public String officeCode() {
        return officeCode;
    }
    public String ageCode() {
        return ageCode;
    }
}
