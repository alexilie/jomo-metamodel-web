package com.jomo.eorganism.metamodel.web.entity;

import java.util.Date;

import lombok.Getter;

import javax.persistence.*;

import com.jomo.eorganism.metamodel.web.util.MetamodelUtil;

@Entity
@Table(name = "application")
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Setter
public class ApplicationEntity extends BaseEntity {

    private String uuid;

    private Integer domainId;
    private Integer systemId;
    private Integer environmentId;
    private Integer releaseId;
    private Integer applicationProfileId;
    private Integer ownerId;
    private Integer eorganismId;
    private Integer supportGroupId;
    private Integer segmentId;
    private Integer metadataId;
    private Integer businessUnitId;
    private Integer eapplicationId;
    private Integer lastUpdatedUserId;
    private Integer lastUpdatedApplicationId;

    private String environmentName;
    private String releaseName;
    private String domainName;
    private String systemName;

    private String name;
    private String type;
    private String description;
    private String status;
    private String inventoryName;
    private String shortName;
    private String longName;
    private String code;
    private String classification;
    private String ownerName;
    private String supportGroupName;
    private String supportGroupEmail;
    private String eapplicationName;
    private String applicationProfileName;
    private String applicationIdInput;
    private String applicationIdInputName;
    private String applicationIdOutput;
    private String applicationIdOutputName;

    private String eorganismName;
    private String taxonomy;
    private String topology;
    private String graphPath;

    private String segmentName;

    private String metadataName;
    private String metadataType;
    private String serviceCode;
    private String businessUnitName;
    private String version;

    private String lastUpdatedUserName;
    private String lastUpdatedApplicationName;
    private Date createdDate;
    private Date lastUpdatedDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Integer getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(Integer metadataId) {
        this.metadataId = metadataId;
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

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Integer getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(Integer environmentId) {
        this.environmentId = environmentId;
    }

    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public Integer getApplicationProfileId() {
        return applicationProfileId;
    }

    public void setApplicationProfileId(Integer applicationProfileId) {
        this.applicationProfileId = applicationProfileId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getEorganismId() {
        return eorganismId;
    }

    public void setEorganismId(Integer eorganismId) {
        this.eorganismId = eorganismId;
    }

    public Integer getSupportGroupId() {
        return supportGroupId;
    }

    public void setSupportGroupId(Integer supportGroupId) {
        this.supportGroupId = supportGroupId;
    }

    public Integer getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    public Integer getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(Integer businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public Integer getEapplicationId() {
        return eapplicationId;
    }

    public void setEapplicationId(Integer eapplicationId) {
        this.eapplicationId = eapplicationId;
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

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getEapplicationName() {
        return eapplicationName;
    }

    public void setEapplicationName(String eapplicationName) {
        this.eapplicationName = eapplicationName;
    }

    public String getApplicationProfileName() {
        return applicationProfileName;
    }

    public void setApplicationProfileName(String applicationProfileName) {
        this.applicationProfileName = applicationProfileName;
    }

    public String getApplicationIdInput() {
        return applicationIdInput;
    }

    public void setApplicationIdInput(String applicationIdInput) {
        this.applicationIdInput = applicationIdInput;
    }

    public String getApplicationIdInputName() {
        return applicationIdInputName;
    }

    public void setApplicationIdInputName(String applicationIdInputName) {
        this.applicationIdInputName = applicationIdInputName;
    }

    public String getApplicationIdOutput() {
        return applicationIdOutput;
    }

    public void setApplicationIdOutput(String applicationIdOutput) {
        this.applicationIdOutput = applicationIdOutput;
    }

    public String getApplicationIdOutputName() {
        return applicationIdOutputName;
    }

    public void setApplicationIdOutputName(String applicationIdOutputName) {
        this.applicationIdOutputName = applicationIdOutputName;
    }

    public String getEorganismName() {
        return eorganismName;
    }

    public void setEorganismName(String eorganismName) {
        this.eorganismName = eorganismName;
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

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApplicationEntity() {
    }

    public ApplicationEntity(String name, String type, String description) {
        this.uuid        = MetamodelUtil.getUuidRandomString();
        this.metadataType = "APPLICATION";
        this.lastUpdatedApplicationName = "Metamodel Web";
        this.lastUpdatedUserName = "eorganism";
        this.name        = name;
        this.type        = type;
        this.description = description;
        this.createdDate = new java.util.Date();
        this.lastUpdatedDate = new java.util.Date();
    }

    @Override
    public String toString() {
        return "ApplicationEntity{" + '\'' +
                super.toString() + '\'' +
                "uuid=" + uuid +
                "domainId=" + domainId +
                ", systemId=" + systemId +
                ", environmentId=" + environmentId +
                ", releaseId=" + releaseId +
                ", applicationProfileId=" + applicationProfileId +
                ", ownerId=" + ownerId +
                ", eorganismId=" + eorganismId +
                ", supportGroupId=" + supportGroupId +
                ", segmentId=" + segmentId +
                ", metadataId=" + metadataId +
                ", businessUnitId=" + businessUnitId +
                ", eapplicationId=" + eapplicationId +
                ", lastUpdatedUserId=" + lastUpdatedUserId +
                ", environmentName='" + environmentName + '\'' +
                ", releaseName='" + releaseName + '\'' +
                ", domainName='" + domainName + '\'' +
                ", systemName='" + systemName + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", inventoryName='" + inventoryName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", longName='" + longName + '\'' +
                ", code='" + code + '\'' +
                ", classification='" + classification + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", supportGroupName='" + supportGroupName + '\'' +
                ", supportGroupEmail='" + supportGroupEmail + '\'' +
                ", eapplicationName='" + eapplicationName + '\'' +
                ", applicationProfileName='" + applicationProfileName + '\'' +
                ", applicationIdInput='" + applicationIdInput + '\'' +
                ", applicationIdInputName='" + applicationIdInputName + '\'' +
                ", applicationIdOutput='" + applicationIdOutput + '\'' +
                ", applicationIdOutputName='" + applicationIdOutputName + '\'' +
                ", eorganismName='" + eorganismName + '\'' +
                ", taxonomy='" + taxonomy + '\'' +
                ", topology='" + topology + '\'' +
                ", graphPath='" + graphPath + '\'' +
                ", segmentName='" + segmentName + '\'' +
                ", metadataName='" + metadataName + '\'' +
                ", metadataType='" + metadataType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", businessUnitName='" + businessUnitName + '\'' +
                ", version='" + version + '\'' +
                ", lastUpdatedUserName='" + lastUpdatedUserName + '\'' +
                ", lastUpdatedApplicationName='" + lastUpdatedApplicationName + '\'' +
                ", lastUpdatedApplicationId=" + lastUpdatedApplicationId +
                ", createdDate=" + createdDate +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
