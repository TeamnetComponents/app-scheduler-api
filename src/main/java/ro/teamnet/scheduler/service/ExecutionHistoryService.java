package ro.teamnet.scheduler.service;

import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.scheduler.dto.JobExecutionDTO;
import ro.teamnet.scheduler.dto.ConfigurationDTO;

/**
 * The public scheduler service.
 */
public interface ExecutionHistoryService {

    AppPage<JobExecutionDTO> findJobExecutions(AppPageable appPageable, ConfigurationDTO configurationDTO);

    Long getExecutionInstanceId(ConfigurationDTO configurationDTO, Long jobExecutionId);
}
