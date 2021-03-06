package ro.teamnet.scheduler.service;

import org.springframework.plugin.core.Plugin;
import ro.teamnet.scheduler.enums.JobExecutionStatus;

/**
 * The execution service used for delegating execution tasks to the clients of the scheduler module..
 */
public interface ExecutionService extends Plugin<String> {
    /**
     * Starts job execution for the given configuration and provides an identifier for accessing the execution data.
     *
     * @param configurationId an identifier associated with the execution configuration
     * @return an identifier associated with the execution data
     */
    Long start(Long configurationId);

    /**
     * Recovers the job execution identified by the given configuration and data id, in case of a scheduler failure.
     *
     * @param configurationId an identifier associated with the execution configuration
     * @param dataId          the execution data identifier (may be null, if failure occurred at start time)
     * @return the identifier associated with the execution data
     */
    Long recover(Long configurationId, Long dataId);

    /**
     * Retrieves the status of the job execution identified by the given data id.
     *
     * @param dataId the execution data identifier
     * @return the execution status
     */
    JobExecutionStatus getStatus(Long dataId);

    /**
     * Pauses the job execution identified by the given data id.
     *
     * @param dataId the execution data identifier
     */
    void pause(Long dataId);

    /**
     * Resumes the job execution identified by the given data id.
     *
     * @param dataId the execution data identifier
     */
    void resume(Long dataId);

    /**
     * Cancels the job execution identified by the given data id.
     *
     * @param dataId the execution data identifier
     */
    void cancel(Long dataId);
}
