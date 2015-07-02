package ro.teamnet.scheduler.enums;

/**
 * Created by Oana.Mihai on 6/3/2015.
 */
public enum JobExecutionStatus {
    WAITING("Waiting", true),
    RUNNING("Running", true),
    PAUSED("Paused", true),
    FINISHED("Finished", false),
    FINISHED_WITH_ERRORS("Finished (with errors)", false),
    FAILED("Failed", false),
    CANCELLED("Cancelled", false);

    private String statusName;
    private boolean isTemporary;

    JobExecutionStatus(String statusName, boolean isTemporary) {
        this.statusName = statusName;
        this.isTemporary = isTemporary;
    }

    public static JobExecutionStatus findByName(String statusName) {
        for (JobExecutionStatus status : values()) {
            if (status.statusName.equals(statusName)) {
                return status;
            }
        }
        return null;
    }

    public String getStatusName() {
        return statusName;
    }

    public boolean isTemporary() {
        return isTemporary;
    }
}
