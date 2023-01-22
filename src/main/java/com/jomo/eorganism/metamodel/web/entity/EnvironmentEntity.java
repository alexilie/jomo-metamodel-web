package com.jomo.eorganism.metamodel.web.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "environment")
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Setter
public class EnvironmentEntity extends BaseEntity {

    private Long releaseId;
    private String name;
    private String type;
    private String description;
    private String status;
    private Date startDate;
    private Date endDate;

    public Long getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Long releaseId) {
        this.releaseId = releaseId;
    }

    public EnvironmentEntity(){
    }

    public EnvironmentEntity(String _name, String _type, String _description){
        name        = _name;
        type        = _type;
        description = _description;
    }

    @Override
    public String toString() {
        return "EnvironmentEntity{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
