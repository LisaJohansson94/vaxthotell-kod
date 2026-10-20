public class Kaktus extends Vaxt {

    private static final double FAST_MANGD_LITER = 0.02;

        public Kaktus(String namn, double langdMeter) {
            super(namn, langdMeter);
        }

        @Override
        public double mangdVatska() {

            return FAST_MANGD_LITER;
        }

        @Override
        public Vatska getVatska() {

            return Vatska.MINERALVATTEN;
        }
    }

