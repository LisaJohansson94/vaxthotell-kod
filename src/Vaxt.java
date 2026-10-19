// Arv & Abstarkt klass: Mall för alla växter som delar gemensamma egenskapar.
public abstract class Vaxt implements IVatskaNaring {
    // Inkapsling: variablerna är private final för att skydda datan. De nås via publika get-metoder.
    private final String namn;
    private final double langdMeter;

    public Vaxt(String namn, double langdMeter) {
        this.namn = namn;
        this.langdMeter = langdMeter;
    }

    public String getNamn() {

        return namn;
    }

    public double getLangdMeter() {

        return langdMeter;
    }

    @Override
    public abstract Vatska getVatska();
}






