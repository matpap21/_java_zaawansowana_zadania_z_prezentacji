package Zadania_domowe.Zad18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WypelnionyFormularz {
    private LocalDate dataUrodzenia;
    private Gender gender;
    private boolean pali;
    private boolean chodziZestresowany;



    @Override
    public String toString() {
        return "dataUrodzenia=" + dataUrodzenia + "\n" +
                "gender=" + gender + "\n" +
                "pali=" + pali + "\n" +
                "chodziZestresowany=" + chodziZestresowany;


    }
}
