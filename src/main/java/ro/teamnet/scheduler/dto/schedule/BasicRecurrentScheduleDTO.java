package ro.teamnet.scheduler.dto.schedule;

import org.joda.time.DateTime;
import ro.teamnet.scheduler.dto.ScheduleDTO;
import ro.teamnet.scheduler.dto.TimeIntervalDTO;
import ro.teamnet.scheduler.enums.ScheduleType;

/**
 * Created by Oana.Mihai on 9/14/2015.
 */
public class BasicRecurrentScheduleDTO extends ScheduleDTO{

    private DateTime startTime;
    private DateTime endTime;
    private Long repetitions;
    private TimeIntervalDTO timeIntervalDTO;

    public BasicRecurrentScheduleDTO(DateTime startTime, TimeIntervalDTO timeIntervalDTO) {
        super(ScheduleType.BASIC_RECURRENT_SCHEDULE);
        this.startTime = startTime;
        this.timeIntervalDTO = timeIntervalDTO;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public Long getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Long repetitions) {
        this.repetitions = repetitions;
    }

    public TimeIntervalDTO getTimeIntervalDTO() {
        return timeIntervalDTO;
    }

    public void setTimeIntervalDTO(TimeIntervalDTO timeIntervalDTO) {
        this.timeIntervalDTO = timeIntervalDTO;
    }
}
