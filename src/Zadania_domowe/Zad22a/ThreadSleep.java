package Zadania_domowe.Zad22a;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ThreadSleep implements Runnable{
    private  boolean active;

    public ThreadSleep() {
        this.active = true;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void run() {
        long fileLength = 0;
       while (active){

           try{
               TimeUnit.NANOSECONDS.sleep (1);
           } catch (InterruptedException e) {
               e.printStackTrace ( );
           }

           File file = new File ("pytania.txt");
           if(file.length () != fileLength){
               System.out.println ("File length has changed and by now is " + file.length () );
               fileLength=file.length ();
           }
       }
    }
}
