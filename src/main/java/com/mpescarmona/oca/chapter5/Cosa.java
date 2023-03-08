package com.mpescarmona.oca.chapter5;

public interface Cosa {
    String COSA = "cosa";

    public String getCosa();

    public default Double getTemperature() {
        return Double.MIN_VALUE;
    }

    public default Double getPressure() {
        return Double.MIN_VALUE;
    }
}
