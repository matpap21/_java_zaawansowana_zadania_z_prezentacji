package Zadania_domowe.Zad16;

import Zadania_domowe.Zad15.BrakOCenStudentaExeption;

import java.util.*;
import java.util.stream.Collectors;

public class Dziennik {
    private List<Student> studentList = new ArrayList<> ( );

    // posiadać metodę 'dodajStudenta(Student):void' do dodawania
    //nowego studenta do dziennika
    public void dodajStudenta(Student dodawanyStudent) {
        studentList.add (dodawanyStudent);
    }
    // posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta

    public void usunStudenta(Student usuwanyStudent) {
        studentList.remove (usuwanyStudent);
    }

    // posiadać metodę 'usuńStudenta(String):void' do usuwania
    // studenta po jego numerze indexu
    public void usunStudenta(String indeksStudenta) {
        for (Student student : studentList) {
            if (student.getIndeks ( ).equals (indeksStudenta)) {
                studentList.remove (student);
                break;
            }
        }
    }

    //posiadać metodę 'zwróćStudenta(String):Student' która jako
    //parametr przyjmuje numer indexu studenta, a w wyniku zwraca
    //konkretnego studenta.
    public Optional<Student> zwrocStudenta(String indeksStudenta) {
        for (Student student : studentList) {
            student.getIndeks ( ).equals (indeksStudenta); {
                return Optional.of (student);
            }
        }
        return Optional.empty ( );
    }

    // posiadać metodę 'podajŚredniąStudenta(String):double' która
    //przyjmuje indeks studenta i zwraca średnią ocen studenta.
    public Double podajŚredniąStudenta(String indeksStudenta) throws BrakOCenStudentaExeption {
        Optional<Student> studentOptional = zwrocStudenta (indeksStudenta);
        if (studentOptional.isPresent ( )) {
            Student student = studentOptional.get ( );
            return student.obliczSredniaOcenStudenta ( );
        }
        throw new StudentNieIstniejeExeption ( );
    }

    // posiadać metodę
    //'podajStudentówZagrożonych():Set<Student>'
    public Set<Student> podajStudentówZagrożonych() {

        Set<Student> studenciZagrozeni = studentList.stream ( )
                .filter (student -> !student.getOceny ( ).isEmpty ( ))
                .filter (student -> {
                    try {
                        return student.obliczSredniaOcenStudenta ( ) < 3.0;
                    } catch (BrakOCenStudentaExeption e) {
                        System.err.println ("Brak Ocen Studenta");
                    }
                    return false;
                })
                .collect (Collectors.toSet ( ));

        return studenciZagrozeni;
    }

    //posiadać metodę
    //'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
    //studentów po numerach indeksów, a następnie zwraca
    //posortowaną listę.
    public List<Student> posortujStudentow() {
        return studentList.stream ( ).sorted (Comparator.comparingLong (student -> Long.parseLong (student.getIndeks ( ))))
                .collect (Collectors.toList ( ));

    }

    // posiadać metodę ‘dodajOcene(String, Double):void’
    public void dodajOcene(String indeksStudenta, Double ocena) {
        Optional<Student> studentOptional = zwrocStudenta (indeksStudenta);
        if (studentOptional.isPresent ( )) {
            Student student = studentOptional.get ( );
            student.getOceny ( ).add (ocena);
            System.out.println ("Dodano ocene " + ocena + " " + studentOptional );
        } else {
            System.err.println ("Brak Studenta");
        }
    }
}
