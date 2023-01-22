package com.jomo.eorganism.metamodel.web.controller;

import com.jomo.eorganism.metamodel.web.entity.ApplicationEntity;
import com.jomo.eorganism.metamodel.web.entity.ComponentEntity;
import com.jomo.eorganism.metamodel.web.entity.DatabaseEntity;
import com.jomo.eorganism.metamodel.web.entity.DomainEntity;
import com.jomo.eorganism.metamodel.web.entity.SystemEntity;
import com.jomo.eorganism.metamodel.web.exception.ApplicationNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.ComponentNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.DatabaseNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.DomainNotFoundException;
import com.jomo.eorganism.metamodel.web.exception.SystemNotFoundException;
import com.jomo.eorganism.metamodel.web.service.ApplicationService;
import com.jomo.eorganism.metamodel.web.service.ComponentService;
import com.jomo.eorganism.metamodel.web.service.DatabaseService;
import com.jomo.eorganism.metamodel.web.service.DomainService;
import com.jomo.eorganism.metamodel.web.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1/metamodel")
public class MetamodelWebRestController {
    private ApplicationService applicationService;
    private DatabaseService databaseService;
    private ComponentService componentService;
    private DomainService domainService;
    private SystemService systemService;

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
    public void setSystemService(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping("/applications")
    public ResponseEntity<List<ApplicationEntity>> getAllApplications() {
        try {
            List<ApplicationEntity> applicationEntityList = (List<ApplicationEntity>) applicationService.listApplications();
            return new ResponseEntity<List<ApplicationEntity>>(applicationEntityList, HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Applications Not Found");
        }
    }

    @GetMapping("/applications/{id}")
    public ResponseEntity<ApplicationEntity> getApplication(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<ApplicationEntity>(applicationService.findApplication(id), HttpStatus.OK);
        } catch (ApplicationNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }

    @GetMapping("/components")
    public ResponseEntity<List<ComponentEntity>> getAllComponents() {
        try {
            List<ComponentEntity> componentEntityList = (List<ComponentEntity>) componentService.listComponents();
            return new ResponseEntity<List<ComponentEntity>>(componentEntityList, HttpStatus.OK);
        } catch (ComponentNotFoundException exception) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Components Not Found");
        }

    }

    @GetMapping("/components/{id}")
    public ResponseEntity<ComponentEntity> getComponent(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<ComponentEntity>(componentService.findComponent(id), HttpStatus.OK);
        } catch (ComponentNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Component Not Found");
        }
    }

    @GetMapping("/databases")
    public ResponseEntity<List<DatabaseEntity>> getAllDatabases() {
        try {
            List<DatabaseEntity> databaseEntityList = (List<DatabaseEntity>) databaseService.listDatabases();
            return new ResponseEntity<List<DatabaseEntity>>(databaseEntityList, HttpStatus.OK);
        } catch (DatabaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Databases Not Found");
        }

    }

    @GetMapping("/databases/{id}")
    public ResponseEntity<DatabaseEntity> getDatabase(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<DatabaseEntity>(databaseService.findDatabase(id), HttpStatus.OK);
        } catch (DatabaseNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Database Not Found");
        }
    }

    @GetMapping("/domains")
    public ResponseEntity<List<DomainEntity>> getAllDomains() {
        try {
            List<DomainEntity> domainEntityList = (List<DomainEntity>) domainService.listDomains();
            return new ResponseEntity<List<DomainEntity>>(domainEntityList, HttpStatus.OK);
        } catch (DomainNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Domains Not Found");
        }

    }

    @GetMapping("/domains/{id}")
    public ResponseEntity<DomainEntity> getDomain(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<DomainEntity>(domainService.findDomain(id), HttpStatus.OK);
        } catch (DomainNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Domain Not Found");
        }
    }

    @GetMapping("/systems")
    public ResponseEntity<List<SystemEntity>> getAllSystems() {
        try{
            List<SystemEntity> systemEntityList = (List<SystemEntity>) systemService.listSystems();
            return new ResponseEntity<List<SystemEntity>>(systemEntityList, HttpStatus.OK);
        }  catch (SystemNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Systems Not Found");
        }

    }

    @GetMapping("/systems/{id}")
    public ResponseEntity<SystemEntity> getSystem(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<SystemEntity>(systemService.findSystem(id), HttpStatus.OK);
        } catch (SystemNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "System Not Found");
        }
    }
}
