package com.jomo.eorganism.metamodel.web.entity;

import com.jomo.eorganism.metamodel.web.util.MetamodelUtil;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import com.jomo.eorganism.metamodel.web.util.MetamodelUtil;

@Entity
@Table(name = "metadata")
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Setter
public class MetadataEntity extends AtomEntity  {

    private Integer originalId;
    private String originalUuid;

    private String status;
    private String code;
    private String classification;
    private String ownerName;
    private String supportGroupName;
    private String supportGroupEmail;

    private String segmentName;

    public Integer getOriginalId() {
        return originalId;
    }

    public void setOriginalId(Integer originalId) {
        this.originalId = originalId;
    }

    public String getOriginalUuid() {
        return originalUuid;
    }

    public void setOriginalUuid(String originalUuid) {
        this.originalUuid = originalUuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSupportGroupName() {
        return supportGroupName;
    }

    public void setSupportGroupName(String supportGroupName) {
        this.supportGroupName = supportGroupName;
    }

    public String getSupportGroupEmail() {
        return supportGroupEmail;
    }

    public void setSupportGroupEmail(String supportGroupEmail) {
        this.supportGroupEmail = supportGroupEmail;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public MetadataEntity() {
        super();
    }

    public MetadataEntity(String name, String type, String description) {
        super(name,type,description);
        setMetadataType("METADATA");
        setShortName(name);
        setLongName(name);
    }

    @Override
    public String toString() {
        return "MetadataEntity{" +
                super.toString() + '\'' +
                ", originalId=" + originalId +
                ", originalUuid='" + originalUuid + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", classification='" + classification + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", supportGroupName='" + supportGroupName + '\'' +
                ", supportGroupEmail='" + supportGroupEmail + '\'' +
                ", segmentName='" + segmentName + '\'' +
                '}';
    }
}
