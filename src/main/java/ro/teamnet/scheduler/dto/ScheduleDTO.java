package ro.teamnet.scheduler.dto;

import ro.teamnet.scheduler.enums.MisfirePolicy;
import ro.teamnet.scheduler.enums.ScheduleType;

/**
 * Created by Oana.Mihai on 9/14/2015.
 */
public abstract class ScheduleDTO {

    private ScheduleType scheduleType;
    private MisfirePolicy misfirePolicy = MisfirePolicy.DO_NOTHING;

    public ScheduleDTO(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public MisfirePolicy getMisfirePolicy() {
        return misfirePolicy;
    }

    public void setMisfirePolicy(MisfirePolicy misfirePolicy) {
        this.misfirePolicy = misfirePolicy;
    }
}
