package com.jomo.eorganism.metamodel.web.entity;

import com.jomo.eorganism.metamodel.web.util.MetamodelUtil;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AtomEntity implements Serializable{

    private static final Logger log = LoggerFactory.getLogger(AtomEntity.class);

    // generic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // generic
    private String uuid;
    private Integer metadataId;
    private Integer lastUpdatedUserId;
    private Integer lastUpdatedApplicationId;
    private Integer eorganismId;
    // generic
    private String name;
    private String type;
    private String description;
    // generic
    private String inventoryName;
    private String shortName;
    private String longName;
    // generic
    private String eorganismName;
    private String metadataName;
    private String metadataType;
    // generic
    private String lastUpdatedUserName;
    private String lastUpdatedApplicationName;
    private Date createdDate;
    private Date lastUpdatedDate;

    public AtomEntity() {
        this.uuid        = MetamodelUtil.getUuidRandomString();
        this.metadataType = "ATOM";
        this.inventoryName  = "ATOM";
        this.shortName      = "Atom entity";
        this.longName       = "Atom entity as base of all Metamodel entities";

        this.lastUpdatedApplicationName = "Metamodel Web";
        this.lastUpdatedUserName = "eorganism_web";

        this.createdDate = new Date();
        this.lastUpdatedDate = new Date();

        this.metadataId = 1;
        this.lastUpdatedUserId = 1;
        this.lastUpdatedApplicationId = 1;
        this.eorganismId = 1;
    }

    public AtomEntity(String name, String type, String description) {
        this.uuid        = MetamodelUtil.getUuidRandomString();
        this.name        = name;
        this.type        = type;
        this.description = description;
        this.metadataType = "ATOM";
        this.inventoryName = "ATOM";
        this.shortName     = "Atom entity";
        this.longName      = "Atom entity as base of all Metamodel entities";

        this.lastUpdatedApplicationName = "Metamodel Web";
        this.lastUpdatedUserName = "eorganism_web";

        this.createdDate = new Date();
        this.lastUpdatedDate = new Date();

        this.metadataId = 1;
        this.lastUpdatedUserId = 1;
        this.lastUpdatedApplicationId = 1;
        this.eorganismId = 1;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(Integer metadataId) {
        this.metadataId = metadataId;
    }

    public Integer getLastUpdatedUserId() {
        return lastUpdatedUserId;
    }

    public void setLastUpdatedUserId(Integer lastUpdatedUserId) {
        this.lastUpdatedUserId = lastUpdatedUserId;
    }

    public Integer getLastUpdatedApplicationId() {
        return lastUpdatedApplicationId;
    }

    public void setLastUpdatedApplicationId(Integer lastUpdatedApplicationId) {
        this.lastUpdatedApplicationId = lastUpdatedApplicationId;
    }

    public Integer getEorganismId() {
        return eorganismId;
    }

    public void setEorganismId(Integer eorganismId) {
        this.eorganismId = eorganismId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

     public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getEorganismName() {
        return eorganismName;
    }

    public void setEorganismName(String eorganismName) {
        this.eorganismName = eorganismName;
    }

    public String getMetadataName() {
        return metadataName;
    }

    public void setMetadataName(String metadataName) {
        this.metadataName = metadataName;
    }

    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    public String getLastUpdatedUserName() {
        return lastUpdatedUserName;
    }

    public void setLastUpdatedUserName(String lastUpdatedUserName) {
        this.lastUpdatedUserName = lastUpdatedUserName;
    }

    public String getLastUpdatedApplicationName() {
        return lastUpdatedApplicationName;
    }

    public void setLastUpdatedApplicationName(String lastUpdatedApplicationName) {
        this.lastUpdatedApplicationName = lastUpdatedApplicationName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public String toString() {
        return "AtomEntity{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", metadataId=" + metadataId +
                ", lastUpdatedUserId=" + lastUpdatedUserId +
                ", lastUpdatedApplicationId=" + lastUpdatedApplicationId +
                ", eorganismId=" + eorganismId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", inventoryName='" + inventoryName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                ", eorganismName='" + eorganismName + '\'' +
                ", metadataName='" + metadataName + '\'' +
                ", metadataType='" + metadataType + '\'' +
                ", lastUpdatedUserName='" + lastUpdatedUserName + '\'' +
                ", lastUpdatedApplicationName='" + lastUpdatedApplicationName + '\'' +
                ", createdDate=" + createdDate +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
