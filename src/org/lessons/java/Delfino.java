package org.lessons.java;

public class Delfino extends Animale implements CanSwim{

    @Override
    public void verso() {
        System.out.println("vocalizzi del delfino");
    }

    @Override
    public void mangia() {
        System.out.println("pesce");
    }

    @Override
    public void nuota() {
        System.out.println("sto nuotando!");
    }
}
