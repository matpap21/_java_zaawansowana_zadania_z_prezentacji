package Zadania_domowe.Zad6;

public class Student {
    private Long indeks;
    private String name;
    private String surname;

    public Long getIndeks() {
        return indeks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setIndeks(Long indeks) {
        this.indeks = indeks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(Long indeks, String name, String surname) {
        this.indeks = indeks;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indeks=" + indeks +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
