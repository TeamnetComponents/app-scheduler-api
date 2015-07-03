package ro.teamnet.scheduler.service;

import ro.teamnet.scheduler.dto.ConfigurationDTO;
import ro.teamnet.scheduler.dto.SchedulingDTO;

/**
 * The public scheduling service.
 */
public interface SchedulingService {

    void createJob(ConfigurationDTO configurationDTO);

    void deleteJob(ConfigurationDTO configurationDTO);

    SchedulingDTO getSchedulingId(ConfigurationDTO configurationDTO);

}
