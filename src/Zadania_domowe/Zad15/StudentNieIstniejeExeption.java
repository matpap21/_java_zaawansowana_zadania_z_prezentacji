package Zadania_domowe.Zad15;

public class StudentNieIstniejeExeption extends RuntimeException {
    public StudentNieIstniejeExeption(){
        super("Student nie istnieje");
    }
}
