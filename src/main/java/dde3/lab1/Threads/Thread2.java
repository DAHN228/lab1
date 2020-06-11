package dde3.lab1.Threads;
import java.util.concurrent.Semaphore;

public class Thread2 extends Thread{
    private Semaphore sem;

    public Thread2(Semaphore sem){
        this.sem=sem;

    }
    public void run()
    {
        try {
            for(int i = 0; i < 10; i++)
            {
                sem.acquire();
                if (Store.n>0) {
                    Store.n--;
                    System.out.println("Отгрузили 1 товар, Кол-во товара на складе = "+Store.n);
                }
                else
                    System.out.println("Не отгружаем, Кол-во товара на складе = "+Store.n);

                sem.release();
            }
        } catch(InterruptedException e) {
            System.out.println ("Что-то пошло не так!");
        }
    }
}
