package Zadania_domowe.Zad10;

public enum PodatekProduktu {

    VAT8 (0.08),
    VAT23 (0.23),
    VAT5 (0.05),
    NO_VAT (0.00);

  private final double podatek;

    public double getPodatek() {
        return podatek;
    }

    PodatekProduktu(double podatek) {
        this.podatek = podatek;

    }
}
