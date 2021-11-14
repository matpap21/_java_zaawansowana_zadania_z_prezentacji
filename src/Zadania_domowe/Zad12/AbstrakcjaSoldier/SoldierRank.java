package Zadania_domowe.Zad12.AbstrakcjaSoldier;

public enum SoldierRank  {
    GROM ("GROM"),
    Army_Commandos ("Army_Commandos"),
    JW_Formoza ("JW_Formoza"),
    JW_AGAT ("JW_AGAT"),
    JW_NIL ("JW_NIL"),
    Special_Operations_Aviation_Squadron ("Special_Operations_Aviation_Squadron");


    private  final String SoldierRank;


    SoldierRank(String sildierrank) {
        this.SoldierRank = sildierrank;
    }

    public String getSoldierRank() {
        return SoldierRank;
    }
}

