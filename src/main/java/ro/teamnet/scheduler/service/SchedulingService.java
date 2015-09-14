package ro.teamnet.scheduler.service;

import ro.teamnet.scheduler.dto.ConfigurationDTO;
import ro.teamnet.scheduler.dto.ScheduleDTO;
import ro.teamnet.scheduler.dto.SchedulingBaseDTO;

/**
 * The public scheduling service.
 */
public interface SchedulingService {

    void createJob(ConfigurationDTO configurationDTO);

    void deleteJob(ConfigurationDTO configurationDTO);

    Long scheduleJob(ConfigurationDTO configurationDTO, ScheduleDTO scheduleDTO);
    void unscheduleJob(ConfigurationDTO configurationDTO);
    void unscheduleJob(ConfigurationDTO configurationDTO, Long scheduleId);

    SchedulingBaseDTO getSchedulingBase(ConfigurationDTO configurationDTO);

    ConfigurationDTO getConfigurationDTOByJobExecId(Long jobExecId);
}
