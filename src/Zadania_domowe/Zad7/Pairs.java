package Zadania_domowe.Zad7;


import java.util.Objects;

public class Pairs {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public Pairs(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    @Override
    //trzeba wpisac public boolean equals i wygeneruje sie sam kod
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pairs)) {
            return false;
        }
        Pairs pairs = (Pairs) o;
        return getNumber1 ( ) == pairs.getNumber1 ( ) && getNumber2 ( ) == pairs.getNumber2 ( );
    }
    @Override
    public int hashCode() {
        return Objects.hash (getNumber1 ( ), getNumber2 ( ));
    }
    @Override
    public String toString() {
        return "Pairs{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }

}
