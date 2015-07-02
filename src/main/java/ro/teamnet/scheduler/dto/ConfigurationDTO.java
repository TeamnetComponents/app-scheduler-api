package ro.teamnet.scheduler.dto;

/**
 * DTO holding a pluggable job configuration.
 */
public class ConfigurationDTO {

    private Long configurationId;

    private String type;

    public ConfigurationDTO(Long configurationId, String type) {
        this.configurationId = configurationId;
        this.type = type;
    }

    public Long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Long configurationId) {
        this.configurationId = configurationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
