package com.jomo.eorganism.metamodel.web.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "domain")
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Setter
public class DomainEntity extends BaseEntity {

    private String name;
    private String type;
    private String description;

    public DomainEntity(){
    }

    public DomainEntity(String _name, String _type, String _description){
        name        = _name;
        type        = _type;
        description = _description;
    }

    @Override
    public String toString() {
        return "DomainEntity{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
