/*
 * Nama    : Anggiat Maruli Tua M
 * NIM     : 11S16051
 */
package itdel.spt.utils;

import java.util.Calendar;

/**
 *
 * @author babiboo39
 */
public class Stopwatch {

    /**
     * @param args the command line arguments
     */
    private long record;
    
    public long getTime(){
        return (Calendar.getInstance().getTimeInMillis());
    }
    
    public void record(){
        record = getTime();
    }
    
    public long capture(){
        return((getTime() - record) / 1000L);
    }
}
