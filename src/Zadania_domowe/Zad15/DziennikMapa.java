package Zadania_domowe.Zad15;

import java.util.*;
import java.util.stream.Collectors;

public class DziennikMapa {
    private Map<String, Student> studentMap = new TreeMap<> (  );
    // posiadać metodę 'dodajStudenta(Student):void' do dodawania
    //nowego studenta do dziennika

    public void dodajStudenta (Student dodawanyStudent){
        studentMap.put (dodawanyStudent.getIndeks ( ), dodawanyStudent);
    }
    // posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    // metoda zaiwrajaca metode, czyli najpierw trzeba stworzyc metode usunStudenta a potem podpiac pod tą metode
    // usuniecie numeru indeksu wraz z Studentem, do ktorego numer indeksu jest przypisany
    public void usunStudenta(Student usuwanyStudent){
       usunStudenta (usuwanyStudent.getIndeks ());
    }
    // posiadać metodę 'usuńStudenta(String):void' do usuwania
    // studenta po jego numerze indexu
    // metoda poelgajaca na usuwaniu nueru indeksu z mapy
    private void usunStudenta(String indeksStudent) {
        studentMap.remove (indeksStudent);
    }
    //posiadać metodę 'zwróćStudenta(String):Student' która jako
    //parametr przyjmuje numer indexu studenta, a w wyniku zwraca
    //konkretnego studenta.
    public Optional<Student> zwrocStudenta(String indeksStudenta){
        return Optional.ofNullable (studentMap.get (indeksStudenta));
    }
    // posiadać metodę 'podajŚredniąStudenta(String):double' która
    //przyjmuje indeks studenta i zwraca średnią ocen studenta.
    public Double wyliczSredniaOcenStudenta(String indeksStudenta) throws BrakOCenStudentaExeption {
        Optional<Student> studentOptional = zwrocStudenta (indeksStudenta);
        if (studentOptional.isPresent ( )) {
            Student student = studentOptional.get ( );
            return student.ObliczSredniaOcen ( );
        } else {
        throw new StudentNieIstniejeExeption ();
        }
    }
    // posiadać metodę
    //'podajStudentówZagrożonych():List<Student>'
    public Set<Student> podajStudentowZagrozonych(){
        Set<Student> studentSet = studentMap
                .values ()
                .stream ()
                .filter (student -> !student.getOceny ().isEmpty ())
                .filter (student -> {
                    try {
                        return  student.ObliczSredniaOcen ()< 3.00;

                    }catch (BrakOCenStudentaExeption bose){
                        System.err.println ("Student nie posiada ocen " );
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

    public List<Student> sortujIndeksyStudentowMapa(){
        return studentMap
                .values ()
                .stream ()
                .sorted ( Comparator.comparingLong (i-> Long.parseLong (i.getIndeks ())) )
                .collect(Collectors.toList());
    }

    public List<Student> sortujIndeksyStudentowArrayLista(){
        return new ArrayList<> (studentMap.values ());
    }
    // posiadać metodę ‘dodajOcene(String, Double):void’
    public void dodajOcene(String indeks, Double ocena){
        Optional<Student> studentOptional = zwrocStudenta (indeks);
        if(studentOptional.isPresent ()){
            Student student = studentOptional.get ();
            student.getOceny ().add (ocena);
            System.out.println ("Dodano ocene" );{
            }
        }else {
            System.out.println ("Taki Student nie istnieje" );
        }
    }



}
