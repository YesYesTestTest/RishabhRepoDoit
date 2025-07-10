import org.quartz.*;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;
public class ArmorJobScheduler {
    private Scheduler scheduler; // This is null and will throw NullPointerException
    public void scheduleIfNotPresentPeriodicJobWithName(String jobName) throws SchedulerException {
        JobKey jobKey = new JobKey(jobName, "DEFAULT");
        // This will throw NullPointerException if scheduler is not initialized
        if (!scheduler.checkExists(jobKey)) {
            System.out.println("Scheduling new job: " + jobName);
            // Add job scheduling logic here
        }
    }
}

