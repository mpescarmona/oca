package com.mpescarmona.oca.chapter5;

import java.util.ArrayList;
import java.util.List;
 import static java.util.Arrays.sort;
public class CosaImpl implements Cosa {

    @Override
    public String getCosa() {
        return COSA;
    }

    public Double getTemperature() {
        return 20d;
    }


    public static void main(String[] args) {
        Double d = 0.0;
        double d1 = 1.2;
        int a[] = new int[4];
        a[3] = (a[0] + a[2])/a[2];

        System.out.println("****");
        System.out.println(d.BYTES);
        System.out.println(d.SIZE);

        CosaImpl cosa = new CosaImpl();

        long lo = 12;

        Cosa kk = new CosaImpl();

        Cosa c = new Cosa(){
            @Override
            public String getCosa() {
                return "Interface Cosa";
            }
        };

        System.out.println(cosa.getTemperature() + " " + c.getTemperature());


    }
}
