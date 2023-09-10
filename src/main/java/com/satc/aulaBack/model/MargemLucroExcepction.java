package com.satc.aulaBack.model;

public class MargemLucroExcepction extends Exception {

    public MargemLucroExcepction() {
        super("A margem de LUCRO MAIOR Q 20%");
    }
}
