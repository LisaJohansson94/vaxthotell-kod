public class KottatandeVaxt extends Vaxt {

        private static final double basMangdLiter = 0.1;
        private static final double extraLiterPerMeter = 0.2;

        public KottatandeVaxt(String namn, double langdMeter) {
            super(namn, langdMeter);
        }

        @Override
        public double mangdVatska() {

            return basMangdLiter + (extraLiterPerMeter * getLangdMeter());
        }

        @Override
        public Vatska getVatska() {

            return Vatska.PROTEINDRYCK;
        }
    }



