/*
 * Nama    : Anggiat Maruli Tua M
 * NIM     : 11S16051
 */
package itdel.spt.primecounter;

import itdel.spt.utils.Stopwatch;

/**
 *
 * @author babiboo39
 */
public class ThreadedMain {
    public static void main(String _args[]){
        Stopwatch stopwatch = new Stopwatch();
        long elapsedTime = 0L;
        long min = 0L;
        long max = 1000000L;
        int numWorker = 500;
        PrimeCounterManager pcm = new PrimeCounterManager(min, max, numWorker);
        stopwatch.record();
        pcm.count();
        elapsedTime = stopwatch.capture();
        System.out.printf("finished in %d sec(s)\n",elapsedTime);
    }
}
