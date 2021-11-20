package Zadania_domowe.Zad16;

import Zadania_domowe.Zad15.BrakOCenStudentaExeption;

import java.util.*;
import java.util.stream.Collectors;

public class DziennikMapa {
    public Map<String, Student> studentMap = new TreeMap<> ( );

    // posiadać metodę 'dodajStudenta(Student):void' do dodawania
    //nowego studenta do dziennika
    public void dodajStudenta(Student dodawanyStudent) {
        studentMap.put (dodawanyStudent.getIndeks ( ), dodawanyStudent);
    }

    // posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    public void usunStudenta(String indeks, Student usuwanyStudent) {
        usunStudenta (usuwanyStudent.getIndeks ( ), usuwanyStudent);
    }

    // posiadać metodę 'usuńStudenta(String):void' do usuwania
    // studenta po jego numerze indexu
    public void usunStudenta(String indeksStudenta) {
        studentMap.remove (indeksStudenta);

    }
    //posiadać metodę 'zwróćStudenta(String):Student' która jako
    //parametr przyjmuje numer indexu studenta, a w wyniku zwraca
    //konkretnego studenta.
    public Optional<Student> zwróćStudenta (String indeksStudenta){
        return Optional.ofNullable (studentMap.get (indeksStudenta));
    }
    // posiadać metodę 'podajŚredniąStudenta(String):double' która
    //przyjmuje indeks studenta i zwraca średnią ocen studenta.
    public Double podajŚredniąStudenta(String indeksStudenta) throws BrakOCenStudentaExeption {
        Optional<Student> studentOptional = zwróćStudenta (indeksStudenta);
        if(studentOptional.isPresent ()){
            Student student = studentOptional.get ();
            return student.obliczSredniaOcenStudenta ();
        }else {
            throw new StudentNieIstniejeExeption ();
        }
    }
    // posiadać metodę
    //'podajStudentówZagrożonych():Set<Student>'
    public Set<Student> podajStudentówZagrożonych(){
        Set<Student> studentSet = studentMap.values ().stream ().filter (student -> !student.getOceny ().isEmpty ())
                .filter (student -> {
                    try {
                        return student.obliczSredniaOcenStudenta ( ) < 3.0;
                    } catch (BrakOCenStudentaExeption e) {
                        System.err.println("Student nie posiada ocen!");
                    return false;
                }
                })
                .collect(Collectors.toSet());
        return studentSet;
    }
    //posiadać metodę
    //'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
    //studentów po numerach indeksów, a następnie zwraca
    //posortowaną listę.
    public List<Student> posortujStudentówPoIndeksie(){
        return studentMap.values ().stream ()
                .sorted ( Comparator.comparingLong (student-> Long.parseLong (student.getIndeks ())) )
                .collect(Collectors.toList());
    }
    //posiadać metodę
    //'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
    //studentów po numerach indeksów, a następnie zwraca
    //posortowaną listę.
    public List<Student> sortowanieStudentowPoIndeksie(){
        return new ArrayList<> ( studentMap.values () );
    }
    // posiadać metodę ‘dodajOcene(String, Double):void’
    public void dodajOcene(String indeksStudenta, Double ocena){
        Optional<Student> optionalStudent = zwróćStudenta (indeksStudenta);
        if(optionalStudent.isPresent ( )){
            Student student = optionalStudent.get ( );
            student.getOceny ().add (ocena);
            System.out.println ("Dodano ocene" );
        }else {
            System.err.println ("Nie ma takiego studenta" );
        }
    }
}
