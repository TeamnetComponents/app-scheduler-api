package ro.teamnet.scheduler.service;

import ro.teamnet.bootstrap.extend.AppPage;
import ro.teamnet.bootstrap.extend.AppPageable;
import ro.teamnet.scheduler.dto.JobExecutionDTO;
import ro.teamnet.scheduler.dto.ConfigurationDTO;

/**
 * The public execution history service.
 */
public interface ExecutionHistoryService {

    AppPage<JobExecutionDTO> findJobExecutions(AppPageable appPageable, ConfigurationDTO configurationDTO);

    AppPage<JobExecutionDTO> findAllJobExecutions(AppPageable appPageable);

    Long getExecutionDataId(ConfigurationDTO configurationDTO, Long jobExecutionId);
}
