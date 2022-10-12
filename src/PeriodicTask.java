import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class PeriodicTask extends TimerTask {
    private int period;
    Timer timer;

    /**
     * The constructor to PeriodicTask.
     *
     * @param period is the period in seconds.
     */
    public PeriodicTask(int period) {
        this.period = period;
        this.timer = new Timer(true);
    }

    /**
     * Start the periodic task.
     */
    public void start() {
        TimerTask timerTask = new PeriodicTask(period);
        timer.scheduleAtFixedRate(timerTask, 0, period*1000);
        System.out.println("Started the periodic check for new files!");
    }

    /**
     * Stop the periodic task.
     */
    public void stop(){
        timer.cancel();
    }

    @Override
    public void run() {
        System.out.println("New check at: " + new Date());

    }

}
