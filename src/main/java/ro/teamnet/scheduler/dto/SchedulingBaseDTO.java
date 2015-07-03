package ro.teamnet.scheduler.dto;

/**
 * Created by Marian.Spoiala on 7/3/2015.
 */
public class SchedulingBaseDTO {
    private Long id;
    private Long version;

    public SchedulingBaseDTO(Long id, Long version) {
        this.id = id;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
