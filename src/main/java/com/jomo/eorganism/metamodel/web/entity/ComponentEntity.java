package com.jomo.eorganism.metamodel.web.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

import com.jomo.eorganism.metamodel.web.util.MetamodelUtil;

@Entity
@Table(name = "component")
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Setter
public class ComponentEntity extends AtomEntity {

    private Integer applicationId;
    private String applicationName;

    private String status;
    private String code;
    private String classification;

    private String taxonomy;
    private String topology;
    private String graphPath;

    private String serviceCode;
    private String version;


    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
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

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public String getTopology() {
        return topology;
    }

    public void setTopology(String topology) {
        this.topology = topology;
    }

    public String getGraphPath() {
        return graphPath;
    }

    public void setGraphPath(String graphPath) {
        this.graphPath = graphPath;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComponentEntity() {
        setName("comp name");
        setType("comp type");
        setDescription("comp description");
        setMetadataType("COMPONENT");
        setShortName("comp Short name");
        setLongName("comp Long Name");
    }

    public ComponentEntity(String name, String type, String description) {
        setName(name);
        setType(type);
        setDescription(description);
        setMetadataType("APPLICATION");
        setShortName(name);
        setLongName(name);
    }

    @Override
    public String toString() {
        return "ComponentEntity{" +
                super.toString() + '\'' +
                ", applicationId=" + applicationId +
                ", applicationName='" + applicationName + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", classification='" + classification + '\'' +
                ", taxonomy='" + taxonomy + '\'' +
                ", topology='" + topology + '\'' +
                ", graphPath='" + graphPath + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
