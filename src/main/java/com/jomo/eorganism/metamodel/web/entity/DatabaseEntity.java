package com.jomo.eorganism.metamodel.web.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import com.jomo.eorganism.metamodel.web.util.MetamodelUtil;

@Entity
@Table(name = "database")
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class DatabaseEntity extends AtomEntity {

    private Integer domainId;
    private Integer systemId;
    private Integer environmentId;
    private Integer releaseId;
    private Integer applicationId;
    private Integer ownerId;
    private Integer supportGroupId;
    private Integer segmentId;
    private Integer metadataId;
    private Integer businessUnitId;
    private Integer lastUpdatedUserId;
    private Integer lastUpdatedApplicationId;

    private String environmentName;
    private String releaseName;
    private String domainName;
    private String systemName;
    private String applicationName;

    private String vendorName;
    private String databaseVersion;
    private String status;
    private String code;
    private String classification;
    private String url;

    private String ownerName;
    private String supportGroupName;
    private String supportGroupEmail;

    private String applicationIdInput;
    private String applicationIdInputName;
    private String applicationIdOutput;
    private String applicationIdOutputName;

    private String databaseIdInput;
    private String databaseIdInputName;
    private String databaseIdOutput;
    private String databaseIdOutputName;

    private String taxonomy;
    private String topology;
    private String graphPath;
    private String segmentName;

    private String serviceCode;

    private String businessUnitName;
    private String version;

    public DatabaseEntity() {
        super();
    }

    public DatabaseEntity(String name, String type, String description) {
        super(name,type,description);
        setMetadataType("DATABASE");
        setShortName(name);
        setLongName(name);
    }

    @Override
    public String toString() {
        return "DatabaseEntity{" +
                super.toString() + '\'' +
                ", domainId=" + domainId +
                ", systemId=" + systemId +
                ", environmentId=" + environmentId +
                ", releaseId=" + releaseId +
                ", applicationId=" + applicationId +
                ", ownerId=" + ownerId +
                ", supportGroupId=" + supportGroupId +
                ", segmentId=" + segmentId +
                ", metadataId=" + metadataId +
                ", businessUnitId=" + businessUnitId +
                ", lastUpdatedUserId=" + lastUpdatedUserId +
                ", lastUpdatedApplicationId=" + lastUpdatedApplicationId +
                ", environmentName='" + environmentName + '\'' +
                ", releaseName='" + releaseName + '\'' +
                ", domainName='" + domainName + '\'' +
                ", systemName='" + systemName + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", databaseVersion='" + databaseVersion + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", classification='" + classification + '\'' +
                ", url='" + url + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", supportGroupName='" + supportGroupName + '\'' +
                ", supportGroupEmail='" + supportGroupEmail + '\'' +
                ", applicationIdInput='" + applicationIdInput + '\'' +
                ", applicationIdInputName='" + applicationIdInputName + '\'' +
                ", applicationIdOutput='" + applicationIdOutput + '\'' +
                ", applicationIdOutputName='" + applicationIdOutputName + '\'' +
                ", databaseIdInput='" + databaseIdInput + '\'' +
                ", databaseIdInputName='" + databaseIdInputName + '\'' +
                ", databaseIdOutput='" + databaseIdOutput + '\'' +
                ", databaseIdOutputName='" + databaseIdOutputName + '\'' +
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
