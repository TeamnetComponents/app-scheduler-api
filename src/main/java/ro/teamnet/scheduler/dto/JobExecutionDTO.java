package ro.teamnet.scheduler.dto;

import org.joda.time.DateTime;
import ro.teamnet.scheduler.enums.JobExecutionStatus;

/**
 * DTO holding information regarding a job execution.
 */
public class JobExecutionDTO {
    private Long id;
    private JobExecutionStatus status;
    private DateTime actualFireTime;
    private DateTime nextFireTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(JobExecutionStatus status) {
        this.status = status;
    }

    public DateTime getActualFireTime() {
        return actualFireTime;
    }

    public void setActualFireTime(DateTime actualFireTime) {
        this.actualFireTime = actualFireTime;
    }

    public DateTime getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(DateTime nextFireTime) {
        this.nextFireTime = nextFireTime;
    }
}
