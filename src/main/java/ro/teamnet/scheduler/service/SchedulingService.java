package ro.teamnet.scheduler.service;

import ro.teamnet.scheduler.dto.ConfigurationDTO;

/**
 * The public scheduler service.
 */
public interface SchedulingService {

    void createJob(ConfigurationDTO jobDTO);

    void deleteJob(ConfigurationDTO jobDTO);

}
