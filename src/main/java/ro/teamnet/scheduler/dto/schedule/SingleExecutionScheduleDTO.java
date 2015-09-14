package ro.teamnet.scheduler.dto.schedule;

import org.joda.time.DateTime;
import ro.teamnet.scheduler.dto.ScheduleDTO;
import ro.teamnet.scheduler.enums.ScheduleType;

/**
 * Created by Oana.Mihai on 9/14/2015.
 */
public class SingleExecutionScheduleDTO extends ScheduleDTO {
    private DateTime executionDateTime;

    public SingleExecutionScheduleDTO(DateTime executionDateTime) {
        super(ScheduleType.SINGLE_EXECUTION_SCHEDULE);
        this.executionDateTime = executionDateTime;
    }

    public DateTime getExecutionDateTime() {
        return executionDateTime;
    }

    public void setExecutionDateTime(DateTime executionDateTime) {
        this.executionDateTime = executionDateTime;
    }
}
