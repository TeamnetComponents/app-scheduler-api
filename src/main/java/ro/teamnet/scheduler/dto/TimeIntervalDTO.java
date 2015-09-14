package ro.teamnet.scheduler.dto;

import ro.teamnet.scheduler.enums.TimeUnitCode;

/**
 * Created by Oana.Mihai on 9/14/2015.
 */
public class TimeIntervalDTO {
    private Long interval;
    private TimeUnitCode timeUnit;

    public TimeIntervalDTO(Long interval, TimeUnitCode timeUnit) {
        this.interval = interval;
        this.timeUnit = timeUnit;
    }

    public Long getInterval() {
        return interval;
    }

    public TimeUnitCode getTimeUnit() {
        return timeUnit;
    }
}
