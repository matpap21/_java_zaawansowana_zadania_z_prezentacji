package Zadania_domowe.Zad12.AbstrakcjaSoldier2;

public class Soldier extends Person{
    private SoldierRank soldierRank;

    public Soldier(String name, String surname,SoldierRank soldierRank) {
        super (name, surname);
        this.soldierRank =soldierRank;
    }

    @Override
    public void presentYourself() {
        System.out.println (" My name is " + name + "" + surname + " I am from Polish Special Forces " + soldierRank.getRankname () );

    }
}
