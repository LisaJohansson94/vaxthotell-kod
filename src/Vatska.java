 public enum Vatska {
        KRANVATTEN("kranvatten"),
        MINERALVATTEN("mineralvatten"),
        PROTEINDRYCK("proteindryck");

        private final String visningsnamn;

        Vatska(String visningsnamn) {
            this.visningsnamn = visningsnamn;
        }

        public String getVisningsnamn() {
            return visningsnamn;
        }
    }

