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
public class ApplicationEntity extends AtomEntity {

    private Integer domainId;
    private Integer systemId;
    private Integer environmentId;
    private Integer releaseId;
    private Integer applicationProfileId;
    private Integer ownerId;
    private Integer supportGroupId;
    private Integer segmentId;
    private Integer metadataId;
    private Integer businessUnitId;
    private Integer eapplicationId;

    private String environmentName;
    private String releaseName;
    private String domainName;
    private String systemName;

    private String status;
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

    private String taxonomy;
    private String topology;
    private String graphPath;

    private String segmentName;

    private String serviceCode;
    private String businessUnitName;
    private String version;

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public void setEnvironmentId(Integer environmentId) {
        this.environmentId = environmentId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public void setApplicationProfileId(Integer applicationProfileId) {
        this.applicationProfileId = applicationProfileId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public void setSupportGroupId(Integer supportGroupId) {
        this.supportGroupId = supportGroupId;
    }

    public void setSegmentId(Integer segmentId) {
        this.segmentId = segmentId;
    }

    @Override
    public void setMetadataId(Integer metadataId) {
        this.metadataId = metadataId;
    }

    public void setBusinessUnitId(Integer businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public void setEapplicationId(Integer eapplicationId) {
        this.eapplicationId = eapplicationId;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setSupportGroupName(String supportGroupName) {
        this.supportGroupName = supportGroupName;
    }

    public void setSupportGroupEmail(String supportGroupEmail) {
        this.supportGroupEmail = supportGroupEmail;
    }

    public void setEapplicationName(String eapplicationName) {
        this.eapplicationName = eapplicationName;
    }

    public void setApplicationProfileName(String applicationProfileName) {
        this.applicationProfileName = applicationProfileName;
    }

    public void setApplicationIdInput(String applicationIdInput) {
        this.applicationIdInput = applicationIdInput;
    }

    public void setApplicationIdInputName(String applicationIdInputName) {
        this.applicationIdInputName = applicationIdInputName;
    }

    public void setApplicationIdOutput(String applicationIdOutput) {
        this.applicationIdOutput = applicationIdOutput;
    }

    public void setApplicationIdOutputName(String applicationIdOutputName) {
        this.applicationIdOutputName = applicationIdOutputName;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public void setTopology(String topology) {
        this.topology = topology;
    }

    public void setGraphPath(String graphPath) {
        this.graphPath = graphPath;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApplicationEntity() {
        super();
    }

    public ApplicationEntity(String name, String type, String description) {
        super(name,type,description);
        setMetadataType("APPLICATION");
        setShortName(name);
        setLongName(name);
    }

    @Override
    public String toString() {
        return "ApplicationEntity{" + '\'' +
                super.toString() + '\'' +
                ", domainId=" + domainId +
                ", systemId=" + systemId +
                ", environmentId=" + environmentId +
                ", releaseId=" + releaseId +
                ", applicationProfileId=" + applicationProfileId +
                ", ownerId=" + ownerId +
                ", supportGroupId=" + supportGroupId +
                ", segmentId=" + segmentId +
                ", metadataId=" + metadataId +
                ", businessUnitId=" + businessUnitId +
                ", eapplicationId=" + eapplicationId +
                ", environmentName='" + environmentName + '\'' +
                ", releaseName='" + releaseName + '\'' +
                ", domainName='" + domainName + '\'' +
                ", systemName='" + systemName + '\'' +
                ", status='" + status + '\'' +
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
                ", taxonomy='" + taxonomy + '\'' +
                ", topology='" + topology + '\'' +
                ", graphPath='" + graphPath + '\'' +
                ", segmentName='" + segmentName + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", businessUnitName='" + businessUnitName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
