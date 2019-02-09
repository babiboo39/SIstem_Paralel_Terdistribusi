/*
 * Nama    : Anggiat Maruli Tua M
 * NIM     : 11S16051
 */
package itdel.spt.primecounter;

/**
 *
 * @author babiboo39
 */
public class ThreadedPrimeCounter extends PrimeCounter implements Runnable
{
    private final Thread thread;
    private long occurence = 0L;
    
    public ThreadedPrimeCounter(long _min, long _max){
        super(_min, _max);
        thread = new Thread(this);
    }
    
    @Override
    public void count(){
        thread.start();
        try{
            thread.join();
        }catch (InterruptedException _ie){
            System.err.println("interupted");
        }
    }
    
    @Override
    public void run(){
        super.count();
    }
}
