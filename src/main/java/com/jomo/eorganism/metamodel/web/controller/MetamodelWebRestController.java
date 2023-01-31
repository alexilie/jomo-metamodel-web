package com.jomo.eorganism.metamodel.web.controller;

import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.entity.ComponentEntity;
import com.jomo.eorganism.metamodel.web.entity.DatabaseEntity;
import com.jomo.eorganism.metamodel.web.entity.DomainEntity;
import com.jomo.eorganism.metamodel.web.entity.SystemEntity;
import com.jomo.eorganism.metamodel.web.entity.ReleaseEntity;
import com.jomo.eorganism.metamodel.web.entity.EnvironmentEntity;
import com.jomo.eorganism.metamodel.web.entity.MetadataEntity;
import com.jomo.eorganism.metamodel.web.exception.ApplicationNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.ComponentNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.DatabaseNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.DomainNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.SystemNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.ReleaseNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.EnvironmentNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.MetadataNotFoundException;
import com.jomo.eorganism.metamodel.web.service.ApplicationService;
import com.jomo.eorganism.metamodel.web.service.ComponentService;
import com.jomo.eorganism.metamodel.web.service.DatabaseService;
import com.jomo.eorganism.metamodel.web.service.DomainService;
import com.jomo.eorganism.metamodel.web.service.SystemService;
import com.jomo.eorganism.metamodel.web.service.ReleaseService;
import com.jomo.eorganism.metamodel.web.service.EnvironmentService;
import com.jomo.eorganism.metamodel.web.service.MetadataService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1/metamodel")
@AllArgsConstructor
public class MetamodelWebRestController {
    private static final Logger log = LoggerFactory.getLogger(MetamodelWebRestController.class);

    private ApplicationService applicationService;
    private DatabaseService databaseService;
    private ComponentService componentService;
    private DomainService domainService;
    private SystemService systemService;
    private ReleaseService releaseService;
    private EnvironmentService environmentService;
    private MetadataService metadataService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) { this.applicationService = applicationService; }

    @Autowired
    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @Autowired
    public void setComponentService(ComponentService componentService) {
        this.componentService = componentService;
    }

    @Autowired
    public void setDomainService(DomainService domainService) {
        this.domainService = domainService;
    }

    @Autowired
    public void setSystemService(SystemService systemService) { this.systemService = systemService; }

    @Autowired
    public void setReleaseService(ReleaseService releaseService) { this.releaseService = releaseService; }

    @Autowired
    public void setEnvironmentService(EnvironmentService environmentService) { this.environmentService = environmentService; }

    @Autowired
    public void setMetadataService(MetadataService metadataService) { this.metadataService = metadataService; }

    @GetMapping("/applications")
    @ApiOperation("Get All Applications")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<List<ApplicationEntity>> getAllApplications() {
        try {
            List<ApplicationEntity> applicationEntityList = (List<ApplicationEntity>) applicationService.listApplications();
            return new ResponseEntity<List<ApplicationEntity>>(applicationEntityList, HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Applications Not Found");
        }
    }

    @GetMapping("/applications/{id}")
    @ApiOperation("Get Application using id")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<ApplicationEntity> getApplication(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<ApplicationEntity>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }

    @PostMapping("/applications")
    @ApiOperation("Add Application")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ApplicationEntity addApplication(@RequestBody ApplicationEntity application) {
        try {
            return applicationService.addApplication(application);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Exception adding Application error is:  "+ e.getMessage());
        }
    }

    @PostMapping("/applications/{id}")
    @ApiOperation("Update Application using id")
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<ApplicationEntity> updateApplication(@PathVariable("id") Integer id, @RequestBody ApplicationEntity updateApplicationEntity) {
        final ApplicationEntity updatedApplication = applicationService.updateById(id, updateApplicationEntity);
        if (updatedApplication == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(updatedApplication);
        }
    }

    @DeleteMapping("/applications/{id}")
    @ApiOperation("Delete Applications based in Id")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteApplication(@PathVariable("id") String id) {
        try {
            applicationService.deleteById(Integer.parseInt(id));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Exception deleting Application id: " + id + "; error is:  "+ e.getMessage());
        }
    }

    @GetMapping("/components")
    @ApiOperation("Get All Components")
    public ResponseEntity<List<ComponentEntity>> getAllComponents() {
        try {
            List<ComponentEntity> componentEntityList = (List<ComponentEntity>) componentService.listComponents();
            return new ResponseEntity<List<ComponentEntity>>(componentEntityList, HttpStatus.OK);
        } catch (ComponentNotFoundException exception) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Components Not Found");
        }

    }

    @GetMapping("/components/{id}")
    @ApiOperation("Get Component using id")
    public ResponseEntity<ComponentEntity> getComponent(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<ComponentEntity>(componentService.findComponent(id), HttpStatus.OK);
        } catch (ComponentNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Component Not Found");
        }
    }

    @GetMapping("/databases")
    @ApiOperation("Get All Databases")
    public ResponseEntity<List<DatabaseEntity>> getAllDatabases() {
        try {
            List<DatabaseEntity> databaseEntityList = (List<DatabaseEntity>) databaseService.listDatabases();
            return new ResponseEntity<List<DatabaseEntity>>(databaseEntityList, HttpStatus.OK);
        } catch (DatabaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Databases Not Found");
        }

    }

    @GetMapping("/databases/{id}")
    @ApiOperation("Get Database using id")
    public ResponseEntity<DatabaseEntity> getDatabase(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<DatabaseEntity>(databaseService.findDatabase(id), HttpStatus.OK);
        } catch (DatabaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Database Not Found");
        }
    }

    @GetMapping("/domains")
    @ApiOperation("Get Domains")
    public ResponseEntity<List<DomainEntity>> getAllDomains() {
        try {
            List<DomainEntity> domainEntityList = (List<DomainEntity>) domainService.listDomains();
            return new ResponseEntity<List<DomainEntity>>(domainEntityList, HttpStatus.OK);
        } catch (DomainNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Domains Not Found");
        }

    }

    @GetMapping("/domains/{id}")
    @ApiOperation("Get Domain using id")
    public ResponseEntity<DomainEntity> getDomain(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<DomainEntity>(domainService.findDomain(id), HttpStatus.OK);
        } catch (DomainNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Domain Not Found");
        }
    }

    @GetMapping("/systems")
    @ApiOperation("Get All Systems")
    public ResponseEntity<List<SystemEntity>> getAllSystems() {
        try{
            List<SystemEntity> systemEntityList = (List<SystemEntity>) systemService.listSystems();
            return new ResponseEntity<List<SystemEntity>>(systemEntityList, HttpStatus.OK);
        }  catch (SystemNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Systems Not Found");
        }

    }

    @GetMapping("/systems/{id}")
    @ApiOperation("Get System using id")
    public ResponseEntity<SystemEntity> getSystem(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<SystemEntity>(systemService.findSystem(id), HttpStatus.OK);
        } catch (SystemNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "System Not Found");
        }
    }

    @GetMapping("/releases")
    @ApiOperation("Get All Releases")
    public ResponseEntity<List<ReleaseEntity>> getAllReleases() {
        try{
            List<ReleaseEntity> releaseEntityList = (List<ReleaseEntity>) releaseService.listReleases();
            return new ResponseEntity<List<ReleaseEntity>>(releaseEntityList, HttpStatus.OK);
        }  catch (ReleaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Releases Not Found");
        }

    }

    @GetMapping("/releases/{id}")
    @ApiOperation("Get Release using id")
    public ResponseEntity<ReleaseEntity> getRelease(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<ReleaseEntity>(releaseService.findRelease(id), HttpStatus.OK);
        } catch (ReleaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Release Not Found");
        }
    }

    //environments
    @GetMapping("/environments")
    @ApiOperation("Get All Environments")
    public ResponseEntity<List<EnvironmentEntity>> getAllEnvironments() {
        try{
            List<EnvironmentEntity> environmentEntityList = (List<EnvironmentEntity>) environmentService.listEnvironments();
            return new ResponseEntity<List<EnvironmentEntity>>(environmentEntityList, HttpStatus.OK);
        }  catch (EnvironmentNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Environments Not Found");
        }

    }

    @GetMapping("/environments/{id}")
    @ApiOperation("Get Environment using id")
    public ResponseEntity<EnvironmentEntity> getEnvironment(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<EnvironmentEntity>(environmentService.findEnvironment(id), HttpStatus.OK);
        } catch (EnvironmentNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Environment Not Found");
        }
    }

    //metadatas
    @GetMapping("/metadatas")
    @ApiOperation("Get All Metadatas")
    public ResponseEntity<List<MetadataEntity>> getAllMetadatas() {
        try{
            List<MetadataEntity> metadataEntityList = (List<MetadataEntity>) metadataService.listMetadatas();
            return new ResponseEntity<List<MetadataEntity>>(metadataEntityList, HttpStatus.OK);
        }  catch (MetadataNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Metadatas Not Found");
        }

    }

    @GetMapping("/metadatas/{id}")
    @ApiOperation("Get Metadata using id")
    public ResponseEntity<MetadataEntity> getMetadata(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<MetadataEntity>(metadataService.findMetadata(id), HttpStatus.OK);
        } catch (MetadataNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Metadata Not Found");
        }
    }
}
