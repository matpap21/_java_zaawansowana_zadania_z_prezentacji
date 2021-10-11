package Enums;

public enum PizzaSize {
    MALA(20),
    SREDNIA(30),
    DUZA(40),
    FAMILIJNA(45),
    MEGA(60);

    private final int size;


    PizzaSize(int size) {
        this.size = size;
    }
    public int getSIZE(){
        return size;
    }
}
