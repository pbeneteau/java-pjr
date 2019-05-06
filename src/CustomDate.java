public class CustomDate {
    private int jour;
    private int mois;
    private int annee;

    public CustomDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return "Date{" + "jour=" + jour + ", mois=" + mois + ", annee=" + annee + '}';
    }
}
