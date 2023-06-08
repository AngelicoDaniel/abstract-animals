package org.lessons.java;

public class Cane extends Animale implements CanSwim{

    @Override
    public void verso() {
        System.out.println("bau");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }
}
