package Zadania_domowe.Zad22a;

public class Work implements Runnable {
    private boolean working;

    public Work() {
        this.working = true;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }


    @Override
    public void run() {
        System.out.println ("Thread is working");
        for (int i = 0; i < 100; i++) {
            if (!working) {
                break;
            } else {
                try {
                    Thread.sleep (2500);

                } catch (InterruptedException e) {
                    e.printStackTrace ( );
                }

                System.out.println ("You can't stop me" );
            }
        }
        System.out.println ("Thread is not working");
    }
}
