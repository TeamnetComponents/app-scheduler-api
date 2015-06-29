package ro.teamnet.scheduler.service;

import ro.teamnet.scheduler.dto.JobExecutionDTO;

import java.util.Set;

/**
 * The scheduler service.
 */
public interface AppSchedulerService {

    Set<JobExecutionDTO> getJobExecutions(Long baseJobId);
}
