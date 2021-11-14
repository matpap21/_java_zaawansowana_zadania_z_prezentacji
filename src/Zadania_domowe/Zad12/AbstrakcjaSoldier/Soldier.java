package Zadania_domowe.Zad12.AbstrakcjaSoldier;

public class Soldier extends Person2 {
    private SoldierRank soldierRank;
    public Soldier(String name, String surname) {
        super (name, surname);

    }

    public Soldier(String name, String surname, SoldierRank soldierRank) {
        super (name, surname);
        this.soldierRank = soldierRank;
    }

    @Override
    public void PresentYourself() {
        System.out.println (" My name is " + name + "" + surname + " I am from Polish Special Forces " + soldierRank.getSoldierRank () );

    }
}
