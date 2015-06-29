package ro.teamnet.scheduler.service;

import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.scheduler.dto.JobExecutionDTO;

/**
 * The scheduler service.
 */
public interface AppSchedulerService {

    AppPage<JobExecutionDTO> findJobExecutions(AppPageable appPageable, Long baseJobId);
}
