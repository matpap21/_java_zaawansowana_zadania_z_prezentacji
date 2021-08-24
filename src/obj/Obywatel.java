package obj;

import java.util.Objects;

public class Obywatel {
    private long pesel;
    private String name;
    private String nazwisko;

    public Obywatel(long pesel, String name, String nazwisko) {
        this.pesel = pesel;
        this.name = name;
        this.nazwisko = nazwisko;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obywatel)) return false;
        Obywatel obywatel = (Obywatel) o;
        return getPesel ( ) == obywatel.getPesel ( ) && Objects.equals (getName ( ), obywatel.getName ( )) && Objects.equals (getNazwisko ( ), obywatel.getNazwisko ( ));
    }

    @Override
    public int hashCode() {
        return Objects.hash (getPesel ( ), getName ( ), getNazwisko ( ));
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "pesel=" + pesel +
                ", name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
