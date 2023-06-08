package org.lessons.java;

public class Delfino extends Animale{

    @Override
    public void verso() {
        System.out.println("vocalizzi del delfino");
    }

    @Override
    public void mangia() {
        System.out.println("pesce");
    }
}
