package Zadania_domowe.Zad18;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WypelnionyFormularz2 {
        private LocalDate dataUrodzenia;
        private Gender gender;
        private boolean pali;
        private boolean chodziZestresowany;
        private boolean czyPlanujeszWziacSlub;


        @Override
        public String toString() {
            return "dataUrodzenia=" + dataUrodzenia + "\n" +
                    "gender=" + gender + "\n" +
                    "pali=" + pali + "\n" +
                    "chodziZestresowany=" + chodziZestresowany + "\n"+
                    "czyPlanujeszMiecZone=" + czyPlanujeszWziacSlub;

        }
    }
