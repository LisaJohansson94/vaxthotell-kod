public class Palm extends Vaxt {

        private static final double literPerMeter = 0.5;

        public Palm(String namn, double langdMeter) {
            super(namn, langdMeter);
        }

        @Override
        public double mangdVatska() {

            return literPerMeter * getLangdMeter();
        }

        @Override
        public Vatska getVatska() {

            return Vatska.KRANVATTEN;
        }
    }







