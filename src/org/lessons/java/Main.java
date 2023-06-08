package org.lessons.java;


    public class Main {

        public static void faiVolare(CanFly animale) {
            animale.vola();
        }

        public static void faiNuotare(CanSwim animale) {
            animale.nuota();
        }

        public static void main(String[] args) {
            Cane cane = new Cane();
            cane.dormi();
            cane.mangia();
            cane.verso();
            faiNuotare(cane);

            Passerotto passerotto = new Passerotto();
            passerotto.dormi();
            passerotto.mangia();
            passerotto.verso();
            faiVolare(passerotto);
        }
    }


