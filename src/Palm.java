public class Palm extends Vaxt {

        private static final double LITER_PER_METER = 0.5;

        public Palm(String namn, double langdMeter) {
            super(namn, langdMeter);
        }

        @Override
        public double mangdVatska() {

            return LITER_PER_METER * getLangdMeter();
        }

        @Override
        public Vatska getVatska() {

            return Vatska.KRANVATTEN;
        }
    }







