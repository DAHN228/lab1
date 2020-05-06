package dde3.lab1;
import java.util.concurrent.Semaphore;

public class Thread1 extends Thread{
    private Semaphore sem;

    public Thread1(Semaphore sem){
        this.sem=sem;

    }
    public void run()
    {
        try {
            for(int i = 0; i < 10; i++)
            {
                sem.acquire();
                if (Store.n<10) {
                    Store.n++;
                    System.out.println("Произвели 1 товар, Кол-во товара на складе = "+Store.n);
                }
                else
                    System.out.println("Не производим, Кол-во товара на складе = "+Store.n);

                sem.release();
            }
        } catch(InterruptedException e) {
            System.out.println ("Что-то пошло не так!");
        }
    }
}

