package ro.teamnet.scheduler.service;

import ro.teamnet.scheduler.dto.ConfigurationDTO;

/**
 * The public scheduling service.
 */
public interface SchedulingService {

    void createJob(ConfigurationDTO configurationDTO);

    void deleteJob(ConfigurationDTO configurationDTO);

    Long getSchedulingId(ConfigurationDTO configurationDTO);

}
