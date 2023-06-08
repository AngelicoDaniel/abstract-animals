package org.lessons.java;

public class Aquila extends Animale implements CanFly{
    @Override
    public void verso() {
        System.out.println("stridio dell'aquila");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }

    @Override
    public void vola() {
        System.out.println("sto volando!");
    }
}
