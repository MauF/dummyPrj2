package com.mau.test.dummy;

public class Dummy2Api {

    private Dummy1Api dummy1Api;

    public String dummy2() {
        return dummy1Api.dummy1() + " dummy1";
    }
}
