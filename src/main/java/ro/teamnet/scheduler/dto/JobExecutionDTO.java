package ro.teamnet.scheduler.dto;

import org.joda.time.DateTime;
import ro.teamnet.scheduler.enums.JobExecutionStatus;

/**
 * DTO holding information regarding a job execution.
 */
public class JobExecutionDTO {
    private Long id;
    private JobExecutionStatus status;
    private DateTime scheduledFireTime;
    private DateTime actualFireTime;
    private DateTime previousFireTime;
    private DateTime nextFireTime;
    private String executionDetails;

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

    public DateTime getScheduledFireTime() {
        return scheduledFireTime;
    }

    public void setScheduledFireTime(DateTime scheduledFireTime) {
        this.scheduledFireTime = scheduledFireTime;
    }

    public DateTime getActualFireTime() {
        return actualFireTime;
    }

    public void setActualFireTime(DateTime actualFireTime) {
        this.actualFireTime = actualFireTime;
    }

    public DateTime getPreviousFireTime() {
        return previousFireTime;
    }

    public void setPreviousFireTime(DateTime previousFireTime) {
        this.previousFireTime = previousFireTime;
    }

    public DateTime getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(DateTime nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public String getExecutionDetails() {
        return executionDetails;
    }

    public void setExecutionDetails(String executionDetails) {
        this.executionDetails = executionDetails;
    }
}
