package com.jomo.eorganism.metamodel.web.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "release")
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Setter
public class ReleaseEntity extends BaseEntity {

    private String name;
    private String type;
    private String description;
    private String status;
    private Date releaseDate;

    public ReleaseEntity(){
    }

    public ReleaseEntity(String _name, String _type, String _description){
        name        = _name;
        type        = _type;
        description = _description;
    }

    @Override
    public String toString() {
        return "ReleaseEntity{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
