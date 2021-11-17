package Zadania_domowe.Zad15;

import java.util.*;
import java.util.stream.Collectors;

public class Dziennik {
    private List<Student> studentList = new ArrayList<> ( );


    // posiadać metodę 'dodajStudenta(Student):void' do dodawania
    //nowego studenta do dziennika

    public void dodajStudenta(Student dodawanystudent){
        studentList.add (dodawanystudent);
    }

    // posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
    public void usunStudenta(Student usuwanystudent){
        studentList.remove (usuwanystudent);
    }

    // posiadać metodę 'usuńStudenta(String):void' do usuwania
    // studenta po jego numerze indexu

    public void usuńStudenta(String indeks){
        for(Student student: studentList ){
            if(student.getIndeks ().equals (indeks)){
                studentList.remove (student);
                break;
            }
        }
    }

    //posiadać metodę 'zwróćStudenta(String):Student' która jako
    //parametr przyjmuje numer indexu studenta, a w wyniku zwraca
    //konkretnego studenta.
    public Optional<Student> zwrocStudenta(String indeks){
        for (Student student: studentList){
            if (student.getIndeks ().equals (indeks)){
                return Optional.of (student);
            }
        }
        return Optional.empty ();
    }
    // posiadać metodę 'podajŚredniąStudenta(String):double' która
    //przyjmuje indeks studenta i zwraca średnią ocen studenta.

    public Double podajSredniaStudenta(String indeks) throws BrakOCenStudentaExeption {
        Optional<Student> sredniaStudentOptional = zwrocStudenta (indeks);
        if (sredniaStudentOptional.isPresent ()){
            Student student = sredniaStudentOptional.get ();
            return student.ObliczSredniaOcen ();
        }

        throw new StudentNieIstniejeExeption ();
    }

    // posiadać metodę
    //'podajStudentówZagrożonych():List<Student>'

    public Set<Student> podajStudentówZagrożonych (){
        Set<Student> zagrozeniStudenci = studentList.stream ()
                .filter (student -> !student.getOceny ().isEmpty ())
                .filter (student -> {
                    try {
                        return student.ObliczSredniaOcen () <3;

                    }catch (BrakOCenStudentaExeption bose){
                        System.err.println ("Student nie posiada ocen" );
                        return false;
                    }
                })
                .collect (Collectors.toSet ());
        return zagrozeniStudenci;
    }
    //posiadać metodę
    //'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
    //studentów po numerach indeksów, a następnie zwraca
    //posortowaną listę.
    public List<Student> posortujStudentówPoIndeksie(){
        return studentList.stream ()
                .sorted ( Comparator.comparingLong (student -> Long.parseLong (student.getIndeks ())) )
                .collect(Collectors.toList());
    }
    // posiadać metodę ‘dodajOcene(String, Double):void’
    public void dodajOcene(String indeks, Double ocena){
        Optional<Student> studentOptional = zwrocStudenta (indeks);
        if(studentOptional.isPresent ()){
            Student student = studentOptional.get ();
            student.getOceny ().add (ocena);
            System.out.println ("Dodano ocene" );
        }else {
            throw new StudentNieIstniejeExeption ();
        }
    }
}
