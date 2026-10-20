public class KottatandeVaxt extends Vaxt {

        private static final double BAS_MANGD_LITER = 0.1;
        private static final double EXTRA_LITER_PER_METER = 0.2;

        public KottatandeVaxt(String namn, double langdMeter) {
            super(namn, langdMeter);
        }

        @Override
        public double mangdVatska() {

            return BAS_MANGD_LITER + (EXTRA_LITER_PER_METER * getLangdMeter());
        }

        @Override
        public Vatska getVatska() {

            return Vatska.PROTEINDRYCK;
        }
    }



