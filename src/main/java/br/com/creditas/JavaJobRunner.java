package br.com.creditas;

import org.jobrunr.jobs.JobId;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaJobRunner {
    private  JobScheduler jobScheduler;

    public JavaJobRunner(JobScheduler jobSchedulerInstance) {
        this.jobScheduler = jobSchedulerInstance;
    }

    public JobId enqueueJob() {
        return jobScheduler.enqueue(() -> System.out.println("test"));
    }
}
