package Zadania_domowe.Zad20;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Programmer {

    private Person person;
    private List<String>  languages;

}

