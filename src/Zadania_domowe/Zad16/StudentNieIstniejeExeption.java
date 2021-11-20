package Zadania_domowe.Zad16;

public class StudentNieIstniejeExeption extends RuntimeException {
    public  StudentNieIstniejeExeption(){
        super("Student nie istnieje");
    }
}
