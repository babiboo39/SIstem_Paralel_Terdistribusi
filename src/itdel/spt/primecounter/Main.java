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
public class Main {
    public static void main(String _args[]){
        Stopwatch stopwatch = new Stopwatch();
        long elapsedTime = 0L;
        long min = 0L;
        long max = 100000L;
        PrimeCounter pc = new PrimeCounter(min, max);
        
        stopwatch.record();
        pc.count();
        elapsedTime = stopwatch.capture();
        System.out.printf("finished in %d sec(s)\n", elapsedTime);
    }
}
